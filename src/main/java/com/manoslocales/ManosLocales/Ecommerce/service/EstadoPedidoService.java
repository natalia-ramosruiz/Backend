package com.manoslocales.ManosLocales.Ecommerce.service;


import com.manoslocales.ManosLocales.Ecommerce.Exceptions.GeneralException;
import com.manoslocales.ManosLocales.Ecommerce.model.EstadoPedido;
import com.manoslocales.ManosLocales.Ecommerce.repository.IestadoPedidoRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.IestadoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstadoPedidoService implements IestadoPedidoService {

    IestadoPedidoRepository iestadoPedidoRepository;

    @Autowired
    public EstadoPedidoService(IestadoPedidoRepository iestadoPedidoRepository) {
        this.iestadoPedidoRepository = iestadoPedidoRepository;
    }

    @Override
    public EstadoPedido createEstadoPedido(EstadoPedido estadoPedido) {
      return this.iestadoPedidoRepository.save(estadoPedido);
    }

    @Override
    public EstadoPedido findbyId(Long id) {
        Optional<EstadoPedido> optionalEstadoPedido= this.iestadoPedidoRepository.findById(id);
        if (optionalEstadoPedido.isPresent())
        {return optionalEstadoPedido.get();
        }
        throw new GeneralException("El id del estatado del producto no existe");
    }

    @Override
    public EstadoPedido updateEstadoPedido(Long id,EstadoPedido estadoPedido) {
        Optional<EstadoPedido> estadoOptional = this.iestadoPedidoRepository.findById(id);

        if (estadoOptional.isPresent()) {
            EstadoPedido estadoToUpdate = estadoOptional.get();

            if (estadoPedido.getDescripcion() != null && !estadoPedido.getDescripcion().trim().isEmpty()) {
                estadoToUpdate.setDescripcion(estadoPedido.getDescripcion());
            }

            return iestadoPedidoRepository.save(estadoToUpdate);
        } else {
            throw new GeneralException("El estado de pedido no existe con id " + id);
        }
    }
}

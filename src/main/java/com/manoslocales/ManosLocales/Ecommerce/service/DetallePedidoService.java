package com.manoslocales.ManosLocales.Ecommerce.service;

import com.manoslocales.ManosLocales.Ecommerce.model.DetallePedido;
import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
import com.manoslocales.ManosLocales.Ecommerce.model.Producto;
import com.manoslocales.ManosLocales.Ecommerce.repository.IdetallepedidoRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.IdetallepedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetallePedidoService implements IdetallepedidoService {

    private IdetallepedidoRepository detallePedidoRepository;

    @Autowired
    public DetallePedidoService(IdetallepedidoRepository detallePedidoRepository) {
        this.detallePedidoRepository = detallePedidoRepository;
    }

    @Override
    public DetallePedido saveDetallePedido(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    @Override
    public DetallePedido findByIdDetallePedido(Long id) {
        DetallePedido detallePedido = detallePedidoRepository.findById(id).orElse(null);
        if (detallePedido == null) {
            System.out.println("Pedido no fue encontrado");
        }
        return detallePedido;
    }

    @Override
    public List<DetallePedido> findAllDetallePedido(Long id) {
        return detallePedidoRepository.findAll();
    }

}
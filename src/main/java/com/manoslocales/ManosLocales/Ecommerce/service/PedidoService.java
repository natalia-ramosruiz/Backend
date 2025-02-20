package com.manoslocales.ManosLocales.Ecommerce.service;

import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
import com.manoslocales.ManosLocales.Ecommerce.repository.IpedidoRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.IpedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoService implements IpedidoService {

    private IpedidoRepository ipedidoRepository;

    @Autowired
    public PedidoService(IpedidoRepository ipedidoRepository) {
        this.ipedidoRepository = ipedidoRepository;
    }

    @Override
    public Pedido savePedido(Pedido pedido) {
        return ipedidoRepository.save(pedido);
    }

    @Override
    public Pedido findByIdPedido(Long id) {
        Pedido pedido = ipedidoRepository.findById(id).orElse(null);
        if (pedido==null){
            System.out.println("El pedido no fue encontrado");
        }
        return pedido;
    }

    @Override
    public List<Pedido> findAllPedido() {
        return ipedidoRepository.findAll();
    }

}
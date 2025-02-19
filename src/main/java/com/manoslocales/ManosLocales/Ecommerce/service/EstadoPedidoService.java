package com.manoslocales.ManosLocales.Ecommerce.service;


import com.manoslocales.ManosLocales.Ecommerce.repository.IestadoPedidoRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.IestadoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoPedidoService implements IestadoPedidoService {

    IestadoPedidoRepository iestadoPedidoRepository;

    @Autowired
    public EstadoPedidoService(IestadoPedidoRepository iestadoPedidoRepository) {
        this.iestadoPedidoRepository = iestadoPedidoRepository;
    }
}

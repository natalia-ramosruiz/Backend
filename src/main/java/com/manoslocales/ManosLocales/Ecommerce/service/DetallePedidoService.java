package com.manoslocales.ManosLocales.Ecommerce.service;

import com.manoslocales.ManosLocales.Ecommerce.model.DetallePedido;
import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
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
    public DetallePedido save(DetallePedido detallePedido) {
        return null;
    }

    @Override
    public DetallePedido findById(Long id) {
        return null;
    }

    @Override
    public List<DetallePedido> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public DetallePedido update(DetallePedido detallePedido) {
        return null;
    }

    @Override
    public List<DetallePedido> findByPedido(Pedido pedido) {
        return List.of();
    }

    //
//    @Override
//    public DetallePedido save(DetallePedido detallePedido) {
//        detallePedido.setIdDetallePedido(
//                detallePedido.getCantidad() * detallePedido.getPrecioUnitario()
//        );
//        return detallePedidoRepository.save(detallePedido);
//    }
//
//    @Override
//    public DetallePedido findById(Long id) {
//        return detallePedidoRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Detalle de pedido no encontrado"));
//    }
//
//    @Override
//    public List<DetallePedido> findAll() {
//        return detallePedidoRepository.findAll();
//    }
//
//    @Override
//    public void delete(Long id) {
//        detallePedidoRepository.deleteById(id);
//    }
//
//    @Override
//    public DetallePedido update(DetallePedido detallePedido) {
//        detallePedido.setSubtotal(
//                detallePedido.getCantidad() * detallePedido.getPrecioUnitario()
//        );
//        return detallePedidoRepository.save(detallePedido);
//    }
//
//    @Override
//    public List<DetallePedido> findByPedido(Pedido pedido) {
//        return detallePedidoRepository.findByPedido(pedido);
//    }
}
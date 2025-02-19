package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.DetallePedido;
import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
import java.util.List;

public interface IdetallepedidoService {
    DetallePedido save(DetallePedido detallePedido);
    DetallePedido findById(Long id);
    List<DetallePedido> findAll();
    void delete(Long id);
    DetallePedido update(DetallePedido detallePedido);
    List<DetallePedido> findByPedido(Pedido pedido);
}

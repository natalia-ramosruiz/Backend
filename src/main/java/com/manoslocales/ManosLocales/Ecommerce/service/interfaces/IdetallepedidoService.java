package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.DetallePedido;
import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
import java.util.List;

public interface IdetallepedidoService {
    DetallePedido saveDetallePedido(DetallePedido detallePedido);
    DetallePedido findByIdDetallePedido(Long id);
    List<DetallePedido> findAllDetallePedido(Long id);
    //DetallePedido updateDetallePedido(Long id, DetallePedido detallePedido);
}
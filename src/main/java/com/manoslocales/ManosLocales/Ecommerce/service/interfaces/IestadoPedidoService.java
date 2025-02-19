package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.EstadoPedido;

public interface IestadoPedidoService {

    EstadoPedido createEstadoPedido(EstadoPedido estadoPedido);
    EstadoPedido findbyId(Long id);
    EstadoPedido updateEstadoPedido(Long id,EstadoPedido estadoPedido);

}

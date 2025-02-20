package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
import java.time.LocalDateTime;
import java.util.List;

public interface IpedidoService {
    Pedido savePedido(Pedido pedido);
    Pedido findByIdPedido(Long id);
    List<Pedido> findAllPedido();
}

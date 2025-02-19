package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
import java.time.LocalDateTime;
import java.util.List;

public interface IpedidoService {
    Pedido save(Pedido pedido);
    Pedido findById(Long id);
    List<Pedido> findAll();
    void delete(Long id);
    Pedido update(Pedido pedido);
    List<Pedido> findByFecha(LocalDateTime inicio, LocalDateTime fin);
    List<Pedido> findByEstado(String estado);
}

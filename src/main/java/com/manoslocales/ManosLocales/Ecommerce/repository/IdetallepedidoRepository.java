package com.manoslocales.ManosLocales.Ecommerce.repository;

import com.manoslocales.ManosLocales.Ecommerce.model.DetallePedido;
import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IdetallepedidoRepository extends JpaRepository<DetallePedido, Long> {
    List<DetallePedido> findByPedido(Pedido pedido);
}

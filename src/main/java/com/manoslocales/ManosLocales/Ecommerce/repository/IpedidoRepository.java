package com.manoslocales.ManosLocales.Ecommerce.repository;

import com.manoslocales.ManosLocales.Ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IpedidoRepository extends JpaRepository<Pedido, Long> {
}

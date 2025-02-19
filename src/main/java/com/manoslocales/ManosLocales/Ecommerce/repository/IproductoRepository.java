package com.manoslocales.ManosLocales.Ecommerce.repository;

import com.manoslocales.ManosLocales.Ecommerce.model.Producto;
import com.manoslocales.ManosLocales.Ecommerce.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IproductoRepository extends JpaRepository<Producto, Long> {
}

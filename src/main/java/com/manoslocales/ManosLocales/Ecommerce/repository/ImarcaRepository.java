package com.manoslocales.ManosLocales.Ecommerce.repository;

import com.manoslocales.ManosLocales.Ecommerce.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImarcaRepository extends JpaRepository<Marca, Long> {
}

package com.manoslocales.ManosLocales.Ecommerce.repository;

import com.manoslocales.ManosLocales.Ecommerce.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IusuarioRepository extends JpaRepository<Usuario, Long> {
}

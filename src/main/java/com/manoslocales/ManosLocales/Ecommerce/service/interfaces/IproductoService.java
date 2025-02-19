package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.Producto;
import com.manoslocales.ManosLocales.Ecommerce.model.Marca;

import java.util.List;

public interface IproductoService {
    Producto save(Producto producto);
    Producto findById(Long id);
    List<Producto> findAll();
    void delete(Long id);
    Producto update(Producto producto);
    List<Producto> findByMarca(Marca marca);
    List<Producto> findByCategoria(Categoria categoria);
}

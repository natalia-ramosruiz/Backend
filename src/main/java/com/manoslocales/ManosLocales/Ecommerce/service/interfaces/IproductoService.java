package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.Producto;
import com.manoslocales.ManosLocales.Ecommerce.model.Marca;

import java.util.List;

public interface IproductoService {
    Producto saveProducto(Producto producto);
    Producto findByIdProducto(Long id);
    List<Producto> findAllProducto();
    void deleteProducto(Long id);
    Producto updateProducto(Long id, Producto producto);
}

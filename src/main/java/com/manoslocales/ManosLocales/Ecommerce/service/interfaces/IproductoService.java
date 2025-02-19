package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.Producto;

import java.util.List;

public interface IproductoService {
    Producto save(Producto producto);
    Producto findProductById(Long id);
    List<Producto> findAllProducts();
    Producto updateProduct(Long id, Producto producto);
    void deleteProduct(Long id);
    boolean isProductInStock(Long id);
    void updateStock(Long id, int quantity);



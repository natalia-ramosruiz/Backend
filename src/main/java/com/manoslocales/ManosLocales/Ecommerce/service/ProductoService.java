package com.manoslocales.ManosLocales.Ecommerce.service;

import com.manoslocales.ManosLocales.Ecommerce.model.Marca;
import com.manoslocales.ManosLocales.Ecommerce.model.Producto;
import com.manoslocales.ManosLocales.Ecommerce.repository.IproductoRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService implements IproductoService {

    private IproductoRepository iproductoRepository;

    @Autowired
    public ProductoService(IproductoRepository iproductoRepository) {
        this.iproductoRepository = iproductoRepository;
    }

    @Override
    public Producto save(Producto producto) {
        return null;
    }

    @Override
    public Producto findById(Long id) {
        return null;
    }

    @Override
    public List<Producto> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Producto update(Producto producto) {
        return null;
    }

    @Override
    public List<Producto> findByMarca(Marca marca) {
        return List.of();
    }


    //    @Override
//    public Producto save(Producto producto) {
//        return productoRepository.save(producto);
//    }
//
//    @Override
//    public Producto findById(Long id) {
//        return productoRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
//    }
//
//    @Override
//    public List<Producto> findAll() {
//        return productoRepository.findAll();
//    }
//
//    @Override
//    public void delete(Long id) {
//        productoRepository.deleteById(id);
//    }
//
//    @Override
//    public Producto update(Producto producto) {
//        if (producto.getId() == null) {
//            throw new RuntimeException("No se puede actualizar un producto sin ID");
//        }
//        return productoRepository.save(producto);
//    }
//
//    @Override
//    public List<Producto> findByMarca(Marca marca) {
//        return productoRepository.findByMarca(marca);
//    }
//
//    @Override
//    public List<Producto> findByCategoria(Categoria categoria) {
//        return productoRepository.findByCategoria(categoria);
//    }
}
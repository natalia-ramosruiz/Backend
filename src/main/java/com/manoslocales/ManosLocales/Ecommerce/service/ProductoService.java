package com.manoslocales.ManosLocales.Ecommerce.service;

import com.taller.ecommerce.model.Producto;
import com.taller.ecommerce.model.Marca;
import com.taller.ecommerce.model.Categoria;
import com.taller.ecommerce.repository.ProductoRepository;
import com.taller.ecommerce.service.interfaces.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto update(Producto producto) {
        if (producto.getId() == null) {
            throw new RuntimeException("No se puede actualizar un producto sin ID");
        }
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findByMarca(Marca marca) {
        return productoRepository.findByMarca(marca);
    }

    @Override
    public List<Producto> findByCategoria(Categoria categoria) {
        return productoRepository.findByCategoria(categoria);
    }
}
package com.manoslocales.ManosLocales.Ecommerce.service;


import com.manoslocales.ManosLocales.Ecommerce.model.Producto;
import com.manoslocales.ManosLocales.Ecommerce.repository.IproductoRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IproductoService {

    private final IproductoRepository productoRepository;

    @Autowired
    public ProductoService(IproductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto findProductById(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    @Override
    public List<Producto> findAllProducts() {
        try {
            return productoRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error al cargar los productos: " + e.getMessage());
        }
    }

    @Override
    public Producto updateProduct(Long id, Producto producto) {
        try {
            Optional<Producto> existingProduct = productoRepository.findById(id);
            if (existingProduct.isPresent()) {
                producto.setId(id);
                return productoRepository.save(producto);
            } else {
                throw new RuntimeException("Product not found with id: " + id);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar producto: " + e.getMessage());
        }
    }

    @Override
    public void deleteProduct(Long id) {
        try {
            if (!productoRepository.existsById(id)) {
                throw new RuntimeException("Producto no encontrado por el id: " + id);
            }
            productoRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar producto: " + e.getMessage());
        }
    }

    @Override
    public boolean isProductInStock(Long id) {
        try {
            Optional<Producto> producto = productoRepository.findById(id);
            return producto.map(p -> p.getStock() > 0).orElse(false);
        } catch (Exception e) {
            throw new RuntimeException("Error al encontrar producto en el stock: " + e.getMessage());
        }
    }
}
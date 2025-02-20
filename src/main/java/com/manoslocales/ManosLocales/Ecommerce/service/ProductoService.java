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
    public Producto saveProducto(Producto producto) {
        return iproductoRepository.save(producto);
    }

    @Override
    public Producto findByIdProducto(Long id) {
        Producto producto = iproductoRepository.findById(id).orElse(null); //Igualamos el producto con el id que le demos, si no encuentra un producto con ese ID vuelve la variable declarada producto nulo
        if (producto==null){
            System.out.println("El producto no fue encontrado");
        }
        return producto;
    }

    @Override
    public List<Producto> findAllProducto() {
        return iproductoRepository.findAll();
    }

    @Override
    public void deleteProducto(Long id) {
        Producto producto = iproductoRepository.findById(id).orElse(null);
        if (producto==null){
            System.out.println("El producto no fue encontrado");
        }else {
            iproductoRepository.deleteById(id);
            System.out.println("Producto eliminado con exito");
        }
    }

    @Override
    public Producto updateProducto(Long id, Producto producto) {
        Producto productoVerificar = iproductoRepository.findById(id).orElse(null); //verificar que el producto exista
        if (productoVerificar==null){
            System.out.println("El producto no fue encontrado");
            return productoVerificar; //si no encuentra ningun producto con ese id se devuelve
        }
            producto.setNombre(producto.getNombre());
            producto.setDescripcion(producto.getDescripcion());
            producto.setPrecio(producto.getPrecio());
            producto.setStock(producto.getStock());
            System.out.println("Producto actualizado con exito");
            return iproductoRepository.save(producto); //devuelve con los nuevos datos
    }
}
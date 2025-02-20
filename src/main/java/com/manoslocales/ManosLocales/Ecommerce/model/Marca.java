package com.manoslocales.ManosLocales.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import java.util.List;

@Data //* Esta anotación de Lombok genera automáticamente getters, setters y también constructores
@Entity //* Le dice a Spring que esta clase representa una tabla en la base de datos
@Table(name = "marca") //* Especifica el nombre de la tabla en la base de datos
public class Marca {
    //*Columnas de la tabla que estoy creando
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca; //*ID único para cada marca
    private String nombre;
    private String descripcion;
    private String productos_id;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL) //* Una marca puede tener muchos productos
    private List<Producto> productos; //* Lista de productos que pertenecen a esta marca

    public Marca() {
    }

    public Marca(Long id_marca, String nombre, String descripcion, String productos_id, List<Producto> productos) {
        this.id_marca = id_marca;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.productos_id = productos_id;
        this.productos = productos;
    }

    public Long getId_marca() {
        return id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProductos_id() {
        return productos_id;
    }

    public void setProductos_id(String productos_id) {
        this.productos_id = productos_id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

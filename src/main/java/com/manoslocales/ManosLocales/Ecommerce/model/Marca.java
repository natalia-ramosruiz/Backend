package com.manoslocales.ManosLocales.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Producto> productos;

    public Marca() {
    }

    public Marca(Long id_marca, String nombre, String descripcion, List<Producto> productos) {
        this.id_marca = id_marca;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

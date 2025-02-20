package com.manoslocales.ManosLocales.Ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //* Esta anotación de Lombok genera automáticamente getters, setters y también constructores
@Entity //* Le dice a Spring que esta clase es una tabla en la base de datos
@Table(name = "producto") //* Especifica el nombre de la tabla en la base de datos
public class Producto {
    //*Columnas de la tabla que estoy creando
    @Id //*PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca_id; //*FK

    public Producto() {}

    public Producto(Marca marca, int stock, double precio, String descripcion, String nombre, Long id) {
        this.marca_id = marca;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id_producto = id;
    }

    public Long getId() {
        return id_producto;
    }

    public void setId(Long id) {
        this.id_producto = id;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Marca getMarca() {
        return marca_id;
    }

    public void setMarca(Marca marca) {
        this.marca_id = marca;
    }
}

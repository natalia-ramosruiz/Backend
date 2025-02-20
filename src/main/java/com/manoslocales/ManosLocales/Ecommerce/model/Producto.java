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
        private String imagenPrincipal;
        private String miniatura1;
        private String miniatura2;
        private String miniatura3;
        private String miniatura4;
        private String talla1;
        private String descripcionLarga;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca_id; //*FK

    public Producto() {}

    public Producto(Long id_producto, Marca marca_id, String descripcionLarga, String talla1, String miniatura4, String miniatura3, String miniatura2, String miniatura1, String imagenPrincipal, int stock, double precio, String descripcion, String nombre) {
        this.id_producto = id_producto;
        this.marca_id = marca_id;
        this.descripcionLarga = descripcionLarga;
        this.talla1 = talla1;
        this.miniatura4 = miniatura4;
        this.miniatura3 = miniatura3;
        this.miniatura2 = miniatura2;
        this.miniatura1 = miniatura1;
        this.imagenPrincipal = imagenPrincipal;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public Marca getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(Marca marca_id) {
        this.marca_id = marca_id;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public String getTalla1() {
        return talla1;
    }

    public void setTalla1(String talla1) {
        this.talla1 = talla1;
    }

    public String getMiniatura4() {
        return miniatura4;
    }

    public void setMiniatura4(String miniatura4) {
        this.miniatura4 = miniatura4;
    }

    public String getMiniatura3() {
        return miniatura3;
    }

    public void setMiniatura3(String miniatura3) {
        this.miniatura3 = miniatura3;
    }

    public String getMiniatura2() {
        return miniatura2;
    }

    public void setMiniatura2(String miniatura2) {
        this.miniatura2 = miniatura2;
    }

    public String getMiniatura1() {
        return miniatura1;
    }

    public void setMiniatura1(String miniatura1) {
        this.miniatura1 = miniatura1;
    }

    public String getImagenPrincipal() {
        return imagenPrincipal;
    }

    public void setImagenPrincipal(String imagenPrincipal) {
        this.imagenPrincipal = imagenPrincipal;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

package com.manoslocales.ManosLocales.Ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {
    @Id
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
    @JoinColumn(name = "marca_id", referencedColumnName = "id_marca")
    private Marca marca;

    public Producto() {
    }

    public Producto(Long id_producto, String nombre, String descripcion, double precio, int stock, String imagenPrincipal, String miniatura1, String miniatura2, String miniatura3, String miniatura4, String talla1, String descripcionLarga, Marca marca) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.imagenPrincipal = imagenPrincipal;
        this.miniatura1 = miniatura1;
        this.miniatura2 = miniatura2;
        this.miniatura3 = miniatura3;
        this.miniatura4 = miniatura4;
        this.talla1 = talla1;
        this.descripcionLarga = descripcionLarga;
        this.marca = marca;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
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

    public String getImagenPrincipal() {
        return imagenPrincipal;
    }

    public void setImagenPrincipal(String imagenPrincipal) {
        this.imagenPrincipal = imagenPrincipal;
    }

    public String getMiniatura1() {
        return miniatura1;
    }

    public void setMiniatura1(String miniatura1) {
        this.miniatura1 = miniatura1;
    }

    public String getMiniatura2() {
        return miniatura2;
    }

    public void setMiniatura2(String miniatura2) {
        this.miniatura2 = miniatura2;
    }

    public String getMiniatura3() {
        return miniatura3;
    }

    public void setMiniatura3(String miniatura3) {
        this.miniatura3 = miniatura3;
    }

    public String getMiniatura4() {
        return miniatura4;
    }

    public void setMiniatura4(String miniatura4) {
        this.miniatura4 = miniatura4;
    }

    public String getTalla1() {
        return talla1;
    }

    public void setTalla1(String talla1) {
        this.talla1 = talla1;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}

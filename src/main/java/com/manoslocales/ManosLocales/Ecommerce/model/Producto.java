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
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;

    public Producto() {}
}

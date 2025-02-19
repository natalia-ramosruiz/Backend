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
    private Long id; //*ID único para cada marca
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "marca") //* Una marca puede tener muchos productos
    private List<Producto> productos; //* Lista de productos que pertenecen a esta marca

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

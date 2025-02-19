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

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL) //* Una marca puede tener muchos productos
    private List<Producto> productos; //* Lista de productos que pertenecen a esta marca
}

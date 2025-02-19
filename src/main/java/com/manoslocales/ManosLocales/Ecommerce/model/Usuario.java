package com.manoslocales.ManosLocales.Ecommerce.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo_documento;
    private Long numero_documento;
    private String nombre;
    private String apellido;
    private String genero;
    private String email;
    private String contrasena;
    private String direccion;
    private Long telefono;



}

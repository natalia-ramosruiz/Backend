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

    public Usuario(Long id, Long telefono, String direccion, String contrasena, String email, String genero, String apellido, String nombre, Long numero_documento, String tipo_documento) {
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contrasena = contrasena;
        this.email = email;
        this.genero = genero;
        this.apellido = apellido;
        this.nombre = nombre;
        this.numero_documento = numero_documento;
        this.tipo_documento = tipo_documento;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(Long numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
}

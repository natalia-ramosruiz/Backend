package com.manoslocales.ManosLocales.Ecommerce.dto;

public class UsuarioDto {
    private String email;
    private String contrasena;

    public UsuarioDto() {
    }

    public UsuarioDto(String email, String contrasena) {
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public class getEmail {
    }
}

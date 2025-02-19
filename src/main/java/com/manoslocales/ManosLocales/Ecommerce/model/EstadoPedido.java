package com.manoslocales.ManosLocales.Ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estado_pedido")
public class EstadoPedido {
    @Id
    private Long id;
    private String descripcion;

    public EstadoPedido(String descripcion, Long id) {
        this.descripcion = descripcion;
        this.id = id;
    }

    public EstadoPedido() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

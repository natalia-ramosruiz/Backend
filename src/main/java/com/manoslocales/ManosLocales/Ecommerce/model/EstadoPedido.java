package com.manoslocales.ManosLocales.Ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EstadoPedido {
    @Id
    private Long id;
    private String descripcion;


}

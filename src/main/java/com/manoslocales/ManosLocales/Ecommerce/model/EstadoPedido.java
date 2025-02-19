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


}

package com.manoslocales.ManosLocales.Ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data //* Esta anotación de Lombok genera automáticamente getters, setters y también constructores
@Entity //* Le dice a Spring que esta clase representa una tabla en la base de datos
@Table(name = "pedido") //* Especifica el nombre de la tabla en la base de dato
public class Pedido {
    //*Columnas de la tabla que estoy creando
    @Id //*PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fecha;
    private Double total;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<DetallePedido> detalles;

    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
    private DetallePedido detallePedido;
}

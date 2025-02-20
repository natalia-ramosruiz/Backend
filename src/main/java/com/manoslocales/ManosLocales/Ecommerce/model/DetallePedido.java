package com.manoslocales.ManosLocales.Ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //* Esta anotación de Lombok genera automáticamente getters, setters y también constructores
@Entity //* Le dice a Spring que esta clase representa una tabla en la base de datos
@Table(name = "detalle_pedido") //* Especifica el nombre de la tabla en la base de datos
public class DetallePedido {
    //*Columnas de la tabla que estoy creando
    @Id //*PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalle;

    private int cantidad; //* Guarda cuántos productos se pidieron
    private double precioUnitario; // Guarda el precio de cada producto
    private double subtotal; // Guarda el total (cantidad × precioUnitario)

    @ManyToOne // Muchos detalles pueden pertenecer a un pedido
    @JoinColumn(name = "id_pedido") // Columna que conecta con la tabla de pedidos
    private Pedido pedido_id; // Referencia al pedido al que pertenece este detalle

    @ManyToOne // Muchos detalles pueden tener el mismo producto
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    private Producto producto_id; // Referencia al producto que se está pidiendo


    public DetallePedido() {
    }

    public DetallePedido(Long id_detalle, int cantidad, double precioUnitario, double subtotal, Pedido pedido_id, Producto producto_id) {
        this.id_detalle = id_detalle;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.pedido_id = pedido_id;
        this.producto_id = producto_id;
    }

    public Long getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(Long id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Pedido getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Pedido pedido_id) {
        this.pedido_id = pedido_id;
    }

    public Producto getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Producto producto_id) {
        this.producto_id = producto_id;
    }
}
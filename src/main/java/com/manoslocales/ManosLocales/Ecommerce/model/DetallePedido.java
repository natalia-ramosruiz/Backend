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
    private Long idDetallePedido;

    private int cantidad; //* Guarda cuántos productos se pidieron
    private double precioUnitario; // Guarda el precio de cada producto
    private double subtotal; // Guarda el total (cantidad × precioUnitario)

    @ManyToOne // Muchos detalles pueden pertenecer a un pedido
    @JoinColumn(name = "id_pedido") // Columna que conecta con la tabla de pedidos
    private Pedido pedido; // Referencia al pedido al que pertenece este detalle

    @ManyToOne // Muchos detalles pueden tener el mismo producto
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    private Producto producto; // Referencia al producto que se está pidiendo

    public DetallePedido(Long idDetallePedido, double precioUnitario, int cantidad, double subtotal, Pedido pedido, Producto producto) {
        this.idDetallePedido = idDetallePedido;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.pedido = pedido;
        this.producto = producto;
    }

    public DetallePedido() {}

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Long getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(Long idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
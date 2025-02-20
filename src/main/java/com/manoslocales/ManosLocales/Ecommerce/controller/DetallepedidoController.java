package com.manoslocales.ManosLocales.Ecommerce.controller;

import com.manoslocales.ManosLocales.Ecommerce.model.DetallePedido;
import com.manoslocales.ManosLocales.Ecommerce.service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/detalle_pedido")
public class DetallepedidoController {

    DetallePedidoService detallePedidoService;

    @Autowired
    public DetallepedidoController(DetallePedidoService detallePedidoService) {
        this.detallePedidoService = detallePedidoService;
    }

    //crear un nuevo detalle de pedido
    @PostMapping("/crear")
    public ResponseEntity<String> createDetallePedido(@RequestBody DetallePedido detallePedido){
        DetallePedido nuevo = detallePedidoService.saveDetallePedido(detallePedido);
        if (nuevo != null){
            return ResponseEntity.ok("Detalle de pedido creado exitosamente");
        }
        return ResponseEntity.badRequest().body("Error al crear detalle de pedido");
    }

    //obtener detalle de pedido por ID
    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable Long id){
        DetallePedido detallePedido = detallePedidoService.findByIdDetallePedido(id);
        if (detallePedido != null) {
            return ResponseEntity.ok("Detalle de pedido encontrado exitosamente");
        }
        return ResponseEntity.status(404).body("No se encontró el detalle de pedido con ID: " + id);
    }

    //obtener todos los detalles de pedido
    @GetMapping("/all")
    public ResponseEntity<String> getAllDetallePedido() {
        List<DetallePedido> detallePedidos = detallePedidoService.findAllDetallePedido(null);
        if (detallePedidos.isEmpty()) {
            return ResponseEntity.ok("No hay detalles de pedido registrados");
        }
        return ResponseEntity.ok("Encontrado con éxito");
    }
}
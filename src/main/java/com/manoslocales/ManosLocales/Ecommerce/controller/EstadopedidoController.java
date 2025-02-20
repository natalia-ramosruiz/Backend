package com.manoslocales.ManosLocales.Ecommerce.controller;

import com.manoslocales.ManosLocales.Ecommerce.Exceptions.GeneralException;
import com.manoslocales.ManosLocales.Ecommerce.model.EstadoPedido;
import com.manoslocales.ManosLocales.Ecommerce.service.EstadoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("api/estado_pedido")
public class EstadopedidoController {

    EstadoPedidoService estadoPedidoService;

    @Autowired
    public EstadopedidoController(EstadoPedidoService estadoPedidoService) {
        this.estadoPedidoService = estadoPedidoService;
    }

    //crear estado nuevo
    @PostMapping("/crear")
    public ResponseEntity<?> crearEstado(@RequestBody EstadoPedido estadoPedido) {
        EstadoPedido nuevo = estadoPedidoService.createEstadoPedido(estadoPedido);
        return ResponseEntity.ok("Estado de pedido creado exitosamente");
    }

    //obtener por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        try {
            EstadoPedido estado = estadoPedidoService.findbyId(id);
            return ResponseEntity.ok(estado);
        } catch (GeneralException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarEstado(@PathVariable Long id, @RequestBody EstadoPedido estadoPedido) {
        try {
            EstadoPedido actualizado = estadoPedidoService.updateEstadoPedido(id, estadoPedido);
            return ResponseEntity.ok("Estado de pedido actualizado exitosamente");
        } catch (GeneralException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

}

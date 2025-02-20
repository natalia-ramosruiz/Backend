package com.manoslocales.ManosLocales.Ecommerce.controller;

import com.manoslocales.ManosLocales.Ecommerce.model.Marca;
import com.manoslocales.ManosLocales.Ecommerce.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("api/marca")
public class MarcaController {

    MarcaService marcaService;

    @Autowired
    public MarcaController(MarcaService marcaService) { this.marcaService = marcaService;}

    //Obtener una marca
    @GetMapping ("/{id}")
    public ResponseEntity<Marca> findByIdMarca(@PathVariable Long id) {
        Marca marca = marcaService.findByIdMarca(id);
        if (marca == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(marca);
    }

    //Obtener todas las marcas
    @GetMapping ("/bring-allmarca")
    public List<Marca> findAllMarca(){ return  marcaService.findAllMarca();}
}

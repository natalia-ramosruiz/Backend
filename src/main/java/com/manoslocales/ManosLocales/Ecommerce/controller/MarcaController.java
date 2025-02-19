package com.manoslocales.ManosLocales.Ecommerce.controller;


import com.manoslocales.ManosLocales.Ecommerce.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Marca")
public class MarcaController {

    @Autowired
    MarcaService marcaService;




}

package com.manoslocales.ManosLocales.Ecommerce.service;

import com.manoslocales.ManosLocales.Ecommerce.model.Marca;
import com.manoslocales.ManosLocales.Ecommerce.repository.ImarcaRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.ImarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MarcaService implements ImarcaService {

    private ImarcaRepository marcaRepository;

    @Autowired
    public MarcaService(ImarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public Marca findByIdMarca(Long id) {
        Marca marca = marcaRepository.findById(id).orElse(null);
        if (marca==null){
            System.out.println("La marca no fue encontrada");
        }
        return marca;
    }

    @Override
    public List<Marca> findAllMarca() {
        return marcaRepository.findAll();
    }
}
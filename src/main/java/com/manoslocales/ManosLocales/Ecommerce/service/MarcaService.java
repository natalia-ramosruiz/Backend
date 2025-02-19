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
    public Marca save(Marca marca) {
        return null;
    }

    @Override
    public Marca findById(Long id) {
        return null;
    }

    @Override
    public List<Marca> findAll() {
        return List.of();
    }

    @Override
    public Marca update(Marca marca) {
        return null;
    }

    //    @Override
//    public Marca save(Marca marca) {
//        return marcaRepository.save(marca);
//    }
//
//    @Override
//    public Marca findById(Long id) {
//        return marcaRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Marca no encontrada"));
//    }
//
//    @Override
//    public List<Marca> findAll() {
//        return marcaRepository.findAll();
//    }
//
//    @Override
//    public void delete(Long id) {
//        marcaRepository.deleteById(id);
//    }
//
//    @Override
//    public Marca update(Marca marca) {
//        if (marca.getId() == null) {
//            throw new RuntimeException("No se puede actualizar una marca sin ID");
//        }
//        return marcaRepository.save(marca);
//    }
}

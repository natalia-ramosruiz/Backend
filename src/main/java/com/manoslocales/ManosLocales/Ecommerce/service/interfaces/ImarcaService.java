package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.Marca;
import java.util.List;

public interface ImarcaService{
    Marca save(Marca marca);
    Marca findById(Long id);
    List<Marca> findAll();
    //*void delete(Long id);
    Marca update(Marca marca);



}




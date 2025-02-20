package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.Marca;
import java.util.List;

public interface ImarcaService{
    Marca findByIdMarca(Long id);
    List<Marca> findAllMarca();



}




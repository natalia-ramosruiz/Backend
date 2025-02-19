package com.manoslocales.ManosLocales.Ecommerce.service;

import com.manoslocales.ManosLocales.Ecommerce.repository.IusuarioRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.IusuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioService implements IusuarioService {


    @Autowired
    IusuarioRepository iusuarioRepository;
}

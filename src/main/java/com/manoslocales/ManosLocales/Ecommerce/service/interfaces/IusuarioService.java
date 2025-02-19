package com.manoslocales.ManosLocales.Ecommerce.service.interfaces;

import com.manoslocales.ManosLocales.Ecommerce.model.Usuario;

import java.util.List;

public interface IusuarioService {

Usuario createUsuario(Usuario usuario);
Usuario findById(Long id);
List<Usuario> findAll();
void delete(Long id);
Usuario updatedUsuario(Long id,Usuario usuario);

}

package com.manoslocales.ManosLocales.Ecommerce.service;

import com.manoslocales.ManosLocales.Ecommerce.Exceptions.GeneralException;
import com.manoslocales.ManosLocales.Ecommerce.model.Usuario;
import com.manoslocales.ManosLocales.Ecommerce.repository.IusuarioRepository;
import com.manoslocales.ManosLocales.Ecommerce.service.interfaces.IusuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UsuarioService implements IusuarioService {

    private final PasswordEncoder passwordEncoder;
    private final IusuarioRepository iusuarioRepository;

    @Autowired
    public UsuarioService(IusuarioRepository iusuarioRepository, PasswordEncoder passwordEncoder) {
        this.iusuarioRepository = iusuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        // Validaciones
        if (Objects.isNull(usuario.getTipo_documento()) || usuario.getTipo_documento().trim().isEmpty()) {
            throw new GeneralException("Tipo de documento es requerido");
        }

        if (Objects.isNull(usuario.getNumero_documento())) {
            throw new GeneralException("Número de documento es requerido");
        }

        String cleanDocumento = usuario.getNumero_documento().toString().replaceAll("\\s+", "");
        if (!cleanDocumento.matches("\\d+")) {
            throw new GeneralException("Número de documento debe ser numérico");
        }
        usuario.setNumero_documento(Long.parseLong(cleanDocumento));

        if (Objects.isNull(usuario.getNombre()) || usuario.getNombre().trim().isEmpty()) {
            throw new GeneralException("Nombre es requerido");
        }

        if (Objects.isNull(usuario.getApellido()) || usuario.getApellido().trim().isEmpty()) {
            throw new GeneralException("Apellido es requerido");
        }

        if (Objects.isNull(usuario.getGenero()) || usuario.getGenero().trim().isEmpty()) {
            throw new GeneralException("Género es requerido");
        }

        if (Objects.isNull(usuario.getEmail()) || usuario.getEmail().trim().isEmpty()) {
            throw new GeneralException("Email es requerido");
        } else {
            Pattern pattern = Pattern.compile("^[\\w\\.-]+@[\\w\\.-]+\\.[a-zA-Z]{2,}$");
            Matcher matcher = pattern.matcher(usuario.getEmail());
            if (!matcher.matches()) {
                throw new GeneralException("Email inválido, verifique que esté bien escrito");
            }
        }

        if (Objects.isNull(usuario.getContrasena()) || usuario.getContrasena().trim().isEmpty()) {
            throw new GeneralException("Contraseña es requerida");
        }

        if (Objects.isNull(usuario.getDireccion()) || usuario.getDireccion().trim().isEmpty()) {
            throw new GeneralException("Dirección es requerida");
        }

        if (Objects.isNull(usuario.getTelefono())) {
            throw new GeneralException("Número de teléfono es requerido");
        }

        String cleanTelefono = usuario.getTelefono().toString().replaceAll("\\s+", "");
        if (!cleanTelefono.matches("\\d+")) {
            throw new GeneralException("Número de teléfono debe ser numérico");
        }
        usuario.setTelefono(Long.parseLong(cleanTelefono));

        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));

        // Guardar usuario en la base de datos
        return this.iusuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        Optional<Usuario> optionalUsuario = this.iusuarioRepository.findById(id);
        if (optionalUsuario.isPresent()) {
            return optionalUsuario.get();
        }
        throw new GeneralException("El usuario con el id: " + id + " no existe");
    }

    @Override
    public List<Usuario> findAll() {
        return this.iusuarioRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Usuario> usuarioOptional = this.iusuarioRepository.findById(id);
        if (usuarioOptional.isEmpty()) {
            throw new GeneralException("El usuario no existe");
        }
        this.iusuarioRepository.delete(usuarioOptional.get());
    }

    @Override
    public Usuario updatedUsuario(Long id, Usuario usuario) {
        Optional<Usuario> usuarioOptional = this.iusuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            Usuario usuarioToUpdate = usuarioOptional.get();

            if (usuario.getTipo_documento() != null) {
                usuarioToUpdate.setTipo_documento(usuario.getTipo_documento());
            }

            if (usuario.getNumero_documento() != null) {
                usuarioToUpdate.setNumero_documento(usuario.getNumero_documento());
            }

            if (usuario.getNombre() != null) {
                usuarioToUpdate.setNombre(usuario.getNombre());
            }

            if (usuario.getApellido() != null) {
                usuarioToUpdate.setApellido(usuario.getApellido());
            }

            if (usuario.getGenero() != null) {
                usuarioToUpdate.setGenero(usuario.getGenero());
            }

            if (usuario.getEmail() != null) {
                usuarioToUpdate.setEmail(usuario.getEmail());
            }

            if (usuario.getContrasena() != null) {
                usuarioToUpdate.setContrasena(usuario.getContrasena());
            }

            if (usuario.getDireccion() != null) {
                usuarioToUpdate.setDireccion(usuario.getDireccion());
            }

            if (usuario.getTelefono() != null) {
                usuarioToUpdate.setTelefono(usuario.getTelefono());
            }

            return iusuarioRepository.save(usuarioToUpdate);
        } else {
            throw new GeneralException("El usuario no existe con id " + id);
        }
    }

    @Override
    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
        Optional<Usuario> usuario = iusuarioRepository.findByEmail(email);
        if (usuario.isEmpty()) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return new org.springframework.security.core.userdetails.User(usuario.get().getEmail(), usuario.get().getContrasena(), new ArrayList<>());
    }
}

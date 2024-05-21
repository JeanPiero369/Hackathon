package com.example._08s01hackathon.Usuario.domain;


import com.example._08s01hackathon.Usuario.infraestructure.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void registrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}

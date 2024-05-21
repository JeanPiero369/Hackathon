package com.example._08s01hackathon.Usuario.application;


import com.example._08s01hackathon.Usuario.domain.Usuario;
import com.example._08s01hackathon.Usuario.domain.UsuarioService;
import com.example._08s01hackathon.Usuario.infraestructure.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/register")
    public ResponseEntity<Void> registrar(@RequestBody Usuario usuario) {
        usuarioService.registrarUsuario(usuario);
        return ResponseEntity.ok().build();
    }


}

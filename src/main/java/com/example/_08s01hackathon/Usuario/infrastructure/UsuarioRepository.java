package com.example._08s01hackathon.Usuario.infrastructure;

import com.example._08s01hackathon.Usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

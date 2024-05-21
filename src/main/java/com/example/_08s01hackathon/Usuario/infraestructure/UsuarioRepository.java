package com.example._08s01hackathon.Usuario.infraestructure;


import com.example._08s01hackathon.Usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

package com.example._08s01hackathon.Etiqueta.infraestrure;

import com.example._08s01hackathon.Etiqueta.domain.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetaRepository extends JpaRepository<Etiqueta, Integer> {
}

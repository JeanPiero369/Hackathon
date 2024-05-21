package com.example._08s01hackathon.Etiqueta.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long idEtiqueta;

    @Column
    String nombre;
}

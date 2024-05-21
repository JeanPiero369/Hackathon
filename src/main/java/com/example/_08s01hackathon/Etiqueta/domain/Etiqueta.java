package com.example._08s01hackathon.Etiqueta.domain;


import com.example._08s01hackathon.Salon.domain.Salon;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long idEtiqueta;

    @Column
    String nombre;

    @ManyToMany
    @JoinTable(
            name="SalonEntiqueta",
        joinColumns = @JoinColumn(name="idSalon"),
        inverseJoinColumns = @JoinColumn(name="idEtiqueta")
            )
    List<Salon> salones=new ArrayList<Salon>();
}

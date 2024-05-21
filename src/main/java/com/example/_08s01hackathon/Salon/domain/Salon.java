package com.example._08s01hackathon.Salon.domain;

import com.example._08s01hackathon.Etiqueta.domain.Etiqueta;
import com.example._08s01hackathon.Reserva.domain.Reserva;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_salon")
    private String nombreSalon;
    @Column(name="ubicacion")
    private String ubicacion;
    @Column(name="capacidad")
    private Integer capacidad;
    @Column(name="descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservas;

    @ManyToMany(mappedBy = "salones")
    private List<Etiqueta> etiquetas=new ArrayList<>();


}

package com.example._08s01hackathon.Usuario.domain;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    int idUsuario;

    @Column
    String nombre;
    @Column
    String correoElectronico;
    @Column
    String contraseña;
    @Column
    String telefono;

    @OneToMany(mappedBy = "usuario")
    List<Reserva> reservas=new List<>();
}

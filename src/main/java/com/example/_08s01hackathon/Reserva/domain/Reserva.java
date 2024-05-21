package com.example._08s01hackathon.Reserva.domain;

import com.example._08s01hackathon.Usuario.domain.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="reserva")
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="fecha", nullable=false)
    private Date fecha;

    @Column(name="hora_inicio", nullable = false)
    private Time horaInicio;
    @Column(name="hora_final", nullable = false)
    private Time horaFinal;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}

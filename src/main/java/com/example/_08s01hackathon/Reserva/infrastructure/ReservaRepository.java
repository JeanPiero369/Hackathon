package com.example._08s01hackathon.Reserva.infrastructure;

import com.example._08s01hackathon.Reserva.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Optional<Reserva> findReservaByFecha(Date fecha);
}

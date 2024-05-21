package com.example._08s01hackathon.Reserva.application;

import com.example._08s01hackathon.Reserva.domain.Reserva;
import com.example._08s01hackathon.Reserva.domain.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    ReservaService reservaService;

    @GetMapping
    public ResponseEntity<List<Reserva>> getAllReservas(){
        return ResponseEntity.ok(reservaService.findAll());
    }

    public ResponseEntity<Void> createReserva(Reserva reserva){
        reservaService.crearReserva(reserva);
        return ResponseEntity.noContent().build();
    }

}

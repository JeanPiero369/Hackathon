package com.example._08s01hackathon.Reserva.application;

import com.example._08s01hackathon.Reserva.domain.Reserva;
import com.example._08s01hackathon.Reserva.domain.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Void> createReserva(@RequestBody Reserva reserva){
        reservaService.crearReserva(reserva);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{reservaId}")
    public ResponseEntity<Reserva> updateReserva(@PathVariable("reservaId") Long id, @RequestBody Reserva reserva){
        return ResponseEntity.ok(reservaService.updateReserva(id, reserva));
    }

    @DeleteMapping("/{reservaId}")
    public ResponseEntity<Void> deleteReserva(@PathVariable("reservaId") Long id){
        reservaService.deleteReserva(id);
        return ResponseEntity.noContent().build();
    }
}

package com.example._08s01hackathon.Reserva.domain;

import com.example._08s01hackathon.Reserva.infrastructure.ReservaRepository;
import com.example._08s01hackathon.Usuario.domain.Usuario;
import com.example._08s01hackathon.Usuario.infrastructure.UsuarioRepository;
import com.example._08s01hackathon.exceptions.NotFoundException;
import com.example._08s01hackathon.exceptions.UniqueConstraintException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    public void crearReserva(Reserva reserva){
        Optional<Reserva> reservaOptional = reservaRepository.findReservaByFecha(reserva.getFecha());
        if (reservaOptional.isPresent() && reserva.getHoraInicio() == reservaOptional.get().getHoraInicio()){
            throw new UniqueConstraintException("Ya existe reserva para esa hora");
        }
        reservaRepository.save(reserva);
    }

    public Reserva updateReserva(Long id, Reserva reserva){
        Reserva reservaExistente = reservaRepository.findById(id).orElseThrow(() -> new NotFoundException("Reserva no encontrada"));
        reservaExistente.setFecha(reserva.getFecha());
        reservaExistente.setHoraInicio(reserva.getHoraInicio());
        reservaExistente.setHoraFinal(reserva.getHoraFinal());
        reservaExistente.setSalon(reserva.getSalon());
        return reservaRepository.save(reservaExistente);
    }

    public void deleteReserva(Long id){
        Optional<Reserva> reserva = reservaRepository.findById(id);
        if (!reserva.isPresent()){
            throw new NotFoundException("Reserva no encontrada");
        }
        reservaRepository.deleteById(id);
    }
}

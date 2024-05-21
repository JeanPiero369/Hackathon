package com.example._08s01hackathon.Salon.infrastructure;

import com.example._08s01hackathon.Salon.domain.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Long> {
}

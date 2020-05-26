package com.solomon.flightregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solomon.flightregistration.entities.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}

package com.solomon.flightregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solomon.flightregistration.entities.Passanger;
@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Long> {

}

package com.solomon.flightregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solomon.flightregistration.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}

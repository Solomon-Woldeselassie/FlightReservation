package com.solomon.flightregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.solomon.flightregistration.entities.Flight;
import com.solomon.flightregistration.repo.FlightRepository;

public class ReservationController {
	@Autowired 
    FlightRepository flightRepo;
	
	@RequestMapping("Reservation")
	public String completeRegisteration(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightRepo.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";	
	}

}

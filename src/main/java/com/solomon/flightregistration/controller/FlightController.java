package com.solomon.flightregistration.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.solomon.flightregistration.entities.Flight;
import com.solomon.flightregistration.repo.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepo;

	@RequestMapping(value="findFlight")
	public String searchFlight(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern ="yyyy-MM-dd") Date departureDate,
			ModelMap modelMap) {

		List<Flight> flight = flightRepo.findFlight(from,to,departureDate);
		modelMap.addAttribute("flights", flight);
		return "displayFlights";
	}

}

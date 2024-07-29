package com.fsnm.controllers;

import com.fsnm.entities.Flight;
import com.fsnm.entities.FlightStatus;
import com.fsnm.repositories.FlightRepository;
import com.fsnm.repositories.FlightStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private FlightStatusRepository flightStatusRepository;

	// for the dropDown to select the flight want to see the information.
	@GetMapping("/allflightNumbers")
	public List<String> getAllFlightNumbers() {
		return flightRepository.findAllFlightNumbers();
	}

	// After selecting the flight Number fetching the information.
	@GetMapping
	public Flight getFlightByNumber(@RequestParam String flightNumber) {
		return flightRepository.findByFlightNumber(flightNumber);
	}

	// Fetching Status by the flightNumber.
	@GetMapping("/flightStatus")
	public List<FlightStatus> getFlightStatusByNumber(@RequestParam String flightNumber) {
		return flightStatusRepository.findByFlightFlightNumber(flightNumber);
	}

}

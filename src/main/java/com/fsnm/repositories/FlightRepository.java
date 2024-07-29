package com.fsnm.repositories;

import com.fsnm.entities.Flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, String> {
	Flight findByFlightNumber(String flightNumber);

	@Query("SELECT f.flightNumber FROM Flight f")
	List<String> findAllFlightNumbers();
}

package com.fsnm.repositories;

import com.fsnm.entities.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flight, Long> {
	Flight findByFlightNumber(String flightNumber);

	@Query("SELECT f.flightNumber FROM Flight f")
	List<String> findAllFlightNumbers();
}

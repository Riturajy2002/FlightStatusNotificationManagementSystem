package com.fsnm.repositories;

import com.fsnm.entities.FlightStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightStatusRepository extends CrudRepository<FlightStatus, Long> {
	List<FlightStatus> findByFlightFlightNumber(String flightNumber);
}

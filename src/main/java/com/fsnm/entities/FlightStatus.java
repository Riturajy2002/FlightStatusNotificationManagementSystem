package com.fsnm.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_status")
public class FlightStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "flight_number", referencedColumnName = "flight_number")
	@JsonBackReference
	private Flight flight;

	@Column(name = "arrival_time")
	private Date arrivalTime;

	@Column(name = "departure_time")
	private Date departureTime;

	@Column(name = "gate")
	private int gate;

	@Column(name = "status")
	private String status;

	public FlightStatus() {
		super();
	}

	public FlightStatus(Long id, Flight flight, Date arrivalTime, Date departureTime, int gate, String status) {
		super();
		this.id = id;
		this.flight = flight;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.gate = gate;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public int getGate() {
		return gate;
	}

	public void setGate(int gate) {
		this.gate = gate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

package com.fsnm.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_details")
public class Flight {

	@Id
	@Column(name = "flight_number")
	private String flightNumber;

	@Column(name = "flight_name")
	private String flightName;

	@Column(name = "source")
	private String source;

	@Column(name = "destination")
	private String destination;

	@Column(name = "class_name")
	private String className;

	@Column(name = "capacity")
	private int capacity;

	@Column(name = "price")
	private int price;

	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Notification> notifications;

	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<FlightStatus> flightStatus;

	public Flight(String flightNumber, String flightName, String source, String destination, int capacity, int price,
			List<Notification> notifications, List<FlightStatus> flightStatus) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.capacity = capacity;
		this.price = price;
		this.notifications = notifications;
		this.flightStatus = flightStatus;
	}

	public Flight() {
		super();
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public List<FlightStatus> getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(List<FlightStatus> flightStatus) {
		this.flightStatus = flightStatus;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}

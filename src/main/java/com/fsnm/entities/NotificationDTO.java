package com.fsnm.entities;

public class NotificationDTO {
    private String flightNumber;
    private String message;
    private String type;

    // Getters and setters

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Constructors

    public NotificationDTO(String flightNumber, String message, String type) {
        super();
        this.flightNumber = flightNumber;
        this.message = message;
        this.type = type;
    }

    public NotificationDTO() {
        super();
    }
}

package com.fsnm.services;

import com.fsnm.entities.Flight;
import com.fsnm.entities.Notification;
import com.fsnm.entities.NotificationDTO;
import com.fsnm.repositories.FlightRepository;
import com.fsnm.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification sendNotification(NotificationDTO notificationDTO) {
        Flight flight = flightRepository.findByFlightNumber(notificationDTO.getFlightNumber());
        if (flight != null) {
            Notification notification = new Notification();
            notification.setFlight(flight);
            notification.setMessage(notificationDTO.getMessage());
            notification.setType(notificationDTO.getType());
            return notificationRepository.save(notification);
        } else {
            throw new RuntimeException("Flight not found for flight number: " + notificationDTO.getFlightNumber());
        }
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
}

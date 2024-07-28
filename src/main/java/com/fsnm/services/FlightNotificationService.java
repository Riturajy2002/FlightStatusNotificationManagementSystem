package com.fsnm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.fsnm.entities.Notification;

@Service
public class FlightNotificationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC = "flight_notifications";

    public void sendNotification(Notification notification) {
        kafkaTemplate.send(TOPIC, notification);
    }
}

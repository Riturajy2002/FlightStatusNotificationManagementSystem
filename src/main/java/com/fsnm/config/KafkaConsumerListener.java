package com.fsnm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fsnm.entities.Notification;
import com.fsnm.services.NotificationService;

@Service
public class KafkaConsumerListener {

    @Autowired
    private NotificationService notificationService;

    @KafkaListener(topics = "flight_notifications", groupId = "group_id")
    public void consume(Notification notification) {
        notificationService.saveNotification(notification);
    }
}

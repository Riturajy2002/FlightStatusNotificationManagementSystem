package com.fsnm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsnm.entities.Notification;
import com.fsnm.entities.NotificationDTO;
import com.fsnm.services.NotificationService;
import com.fsnm.services.SmsNotificationService;

@RestController
@RequestMapping("/api")
public class NotificationController {

    @Autowired
    private SmsNotificationService smsNotificationService;

    @GetMapping("/sendSms")
    public String sendSms(@RequestParam String to, @RequestParam String message) {
        // Log the phone number to debug
        System.out.println("Sending SMS to: " + to);
        smsNotificationService.sendSms(to, message);
        return "SMS sent successfully!";
    }

    @PostMapping("/sendSms")
    public void sendSms(@RequestBody NotificationDTO notificationDTO) {
        // Delegate to the notification service to handle the logic
        Notification notification = notificationService.sendNotification(notificationDTO);
        // Send SMS
        smsNotificationService.sendSms(notification);
    }

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notifications")
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @PostMapping("/notifications")
    public Notification saveNotification(@RequestBody Notification notification) {
        return notificationService.saveNotification(notification);
    }
}

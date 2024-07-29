package com.fsnm.services;

import com.fsnm.entities.Notification;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService {

    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.auth.token}")
    private String authToken;

    @Value("${twilio.phone.number}")
    private String fromNumber;

    @PostConstruct
    public void init() {
        Twilio.init(accountSid, authToken);
    }

    public void sendSms(String to, String message) {
        Message.creator(
                new PhoneNumber(to),
                new PhoneNumber(fromNumber),
                message
        ).create();
    }

    public void sendSms(Notification notification) {
    	
    	String to = "+918707755346";
        //String to = notification.getFlight().getPhoneNumber(); // Assuming Flight entity has a phoneNumber field
        Message.creator(
                new PhoneNumber(to),
                new PhoneNumber(fromNumber),
                notification.getMessage()
        ).create();
    }
}

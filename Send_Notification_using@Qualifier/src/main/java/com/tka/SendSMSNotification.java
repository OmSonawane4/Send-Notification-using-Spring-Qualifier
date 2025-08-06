package com.tka;

import org.springframework.stereotype.Component;

@Component("sms")
public class SendSMSNotification implements NotificationService {

	public String sendNotification() {
		return "Notification sent via SMS";
	}

}

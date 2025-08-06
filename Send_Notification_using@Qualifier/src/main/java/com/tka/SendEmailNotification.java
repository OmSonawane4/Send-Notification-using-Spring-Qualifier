package com.tka;

import org.springframework.stereotype.Component;

@Component("email")
public class SendEmailNotification implements NotificationService{

	public String sendNotification() {
		return "Notification sent via Email";
	}

	

}

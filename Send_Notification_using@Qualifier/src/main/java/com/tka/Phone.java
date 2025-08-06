package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	@Qualifier("email")
	@Autowired
	private NotificationService email;
	
	@Qualifier("sms")
	@Autowired
	private NotificationService sms;
	
	public NotificationService getEmail() {
		return email;
	}

	public void setEmail(NotificationService email) {
		this.email = email;
	}

	public NotificationService getSms() {
		return sms;
	}

	public void setSms(NotificationService sms) {
		this.sms = sms;
	}

	

}

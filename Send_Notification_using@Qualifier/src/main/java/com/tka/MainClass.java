package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Phone p = context.getBean(Phone.class);
		System.out.println(p.getEmail().sendNotification());
		System.out.println(p.getSms().sendNotification());
		
		
		
	}

}

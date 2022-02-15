package com.kvsaimadhav.springify.di.email;

import org.springframework.stereotype.Component;

@Component
public class GoogleEmailService implements EmailService{

	public void sendEmail(String to, String body) {
		System.out.println("--GoogleEmailService--");
		System.out.println("Sending to" + to);
		System.out.println("Message " + body);
	}
}

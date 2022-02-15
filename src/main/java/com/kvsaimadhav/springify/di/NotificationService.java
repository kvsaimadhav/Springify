package com.kvsaimadhav.springify.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kvsaimadhav.springify.di.email.EmailService;

@Component
public class NotificationService {
	
	// Property Based DI
	@Autowired
	@Qualifier("googleEmailService")
	private EmailService emailService;
	
	/*//Constructor Based DI
	 * public NotificationService(EmailService service) {
		this.emailService = service;
	}*/
	
	public void sendNotification(String to, String message) {
		emailService.sendEmail(to, message);
	}
}

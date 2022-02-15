package com.kvsaimadhav.springify.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		NotificationService service = context.getBean(NotificationService.class);
		
		service.sendNotification("kvsaimadhav@gmail.com", "How cold is it in Michigan");
		
		context.close();

	}

}

package com.kvsaimadhav.springify.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hello hello1 = context.getBean(Hello.class);
		hello1.sayHello(" How are you?");
		
		Hello hello2 = context.getBean(Hello.class);
		//hello2.sayHello(" I'm good.");
		System.out.println(hello1 == hello2);
		context.close();
	}
}

package com.kvsaimadhav.springify.simple;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hello {

	public void sayHello(String str) {
		System.out.println("Hello Spring: " + str);
	}

}

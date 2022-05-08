package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Laptop l = ctx.getBean(Laptop.class);
		l.LapConfig();
	}

}

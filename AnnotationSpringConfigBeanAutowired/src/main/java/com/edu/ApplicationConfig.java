package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ComponentScan;

@Component
@ComponentScan(basePackages="com.edu")

//@Configuration
public class ApplicationConfig {
	/*
	@Bean
	public Laptop getLaptop() {
		return new Laptop();
	}
	@Bean
	public LapProcessor getProcessor() {
		return new IntelCoreI3();
	}*/

}

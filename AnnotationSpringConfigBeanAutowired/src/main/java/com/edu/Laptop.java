package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	LapProcessor pro;

	public LapProcessor getPro() {
		return pro;
	}

	public void setPro(LapProcessor pro) {
		this.pro = pro;
	}

	public void LapConfig() {
		System.out.println("Intel Core I3, Windows 10");
		pro.processor();
	}
	
}

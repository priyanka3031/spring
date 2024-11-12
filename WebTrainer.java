package com.spring.spring_di2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("webt")
public class WebTrainer {
	private String name;

	public WebTrainer(@Value("Pruthvi")String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

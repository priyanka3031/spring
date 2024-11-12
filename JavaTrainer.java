package com.spring.spring_di2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("javat")
public class JavaTrainer {
	private String name;

	public JavaTrainer(@Value("Rudhresh") String name) {
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

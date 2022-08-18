package com.godigit.java_based_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


	@Bean
	public Animal animal() {
		return new Animal();
	}
	
}

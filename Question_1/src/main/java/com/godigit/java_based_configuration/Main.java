package com.godigit.java_based_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	Animal animal =(Animal)context.getBean(Animal.class);
	animal.lion();
}
}

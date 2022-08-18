package com.godigit.XML_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	Drinking drink = (Drinking)context.getBean("check");
	drink.beer();
	drink.whisky();
	
}
}

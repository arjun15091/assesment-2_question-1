package com.godigit_Annotation_Based_Configurartion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	Company company = (Company)context.getBean("com");
	System.out.println("CompanyName : " + company.getCompanyName());
	System.out.println(company.getE());
}
}

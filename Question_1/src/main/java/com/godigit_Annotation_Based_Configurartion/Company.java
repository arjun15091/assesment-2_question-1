package com.godigit_Annotation_Based_Configurartion;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {

	public String companyName;
	public Employee e;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee getE() {
		return e;
	}
	
	@Autowired
	public void setE(Employee e) {
		this.e = e;
	}
	
	public void showComapanyInfo() {
		System.out.println("nice company!!!!!!!");
	}
	
	
}

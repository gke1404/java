package org.day4;

import org.day4Inheritance.Inheritance;

//Child Class

//parent class using Extends keyword

//public class IndustryDetails extends CompanyDetails{

public class IndustryDetails extends Inheritance{
	private void industryType() {
		System.out.println("Industry Type : IT Skills Development");

	}
	public static void main(String[] args) {
		IndustryDetails i = new IndustryDetails(); //object
		
		i.industryType();
		i.companyName(); //Without creating Object for parent class
		i.companyId();
		i.empId();
	}

}
//Multi-level and Single Inheritance used
//Hierarchical Inheritance
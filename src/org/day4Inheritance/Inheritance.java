package org.day4Inheritance;

import org.day4.CompanyDetails;

//Multi-Level Inheritance
//Parent
public class Inheritance extends CompanyDetails {
	public void empId() {
		System.out.println("Emp Id : 1426j1234");

	}
	public static void main(String[] args) {
		Inheritance ih = new Inheritance();
		
		ih.empId();
		ih.companyName();
		ih.companyId();
	}
}
//Hierarchical Inheritance also used
package org.day4;

//Single Inheritance
//Parent Class
//Grandparent
public class CompanyDetails {
	public void companyName() {
		System.out.println("Company Name : Smart Skills Technology");

	}
	public void companyId() {
		System.out.println("Company Id : IT123Ind");

	}
	public static void main(String[] args) {
		CompanyDetails c = new CompanyDetails();
		
		c.companyName();
		c.companyId();
	}

}

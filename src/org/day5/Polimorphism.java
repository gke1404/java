package org.day5;


//Method Overloading
//Same Method in One Class using diiferent datatype or arguments

public class Polimorphism {
	private void companyId(int age) {
		System.out.println("Company Id : 0001");
		System.out.println(age);

	}
	private void companyId(long l, float f) {
		System.out.println("Company Id : 0002");

	}
	private void companyId(String h, long l) {
		System.out.println("Company Id : 0003");
	
	}
	private void companyId() {
		System.out.println("Company Id : 0004");
	
	}	
	public static void main(String[] args) {
		Polimorphism p = new Polimorphism();
		
		p.companyId(30);
		p.companyId(3245l, 9876.4542f);
		p.companyId("Smart", 12345678909l);
		p.companyId();
	}
}

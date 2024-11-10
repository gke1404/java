package org.test;

public class ClassA {

	private void carPrice() {
		
		int BMW = 1879800;
		System.out.println("BMW Car Price is:"+ BMW);

	}
	private void carModel() {
		
		int Year = 2009;
		System.out.println("BMW Car Model:"+ Year);
	}
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		
		a.carPrice();
		a.carModel();
	}
}

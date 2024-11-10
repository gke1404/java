package org.day6;

//NestedIf Statement

public class CondStateNestedIf {
	public static void main(String[] args) {
		
		//Decalaration and Initilization

	
		int age = 30;
		
		if (age == 36) {
			System.out.println("Eligible 1");
			
			if (age >= 30) {
				System.out.println("Eligible 2");
			}
						
		} 
		else {
			System.out.println("Not Eligible");

		}
	}

}

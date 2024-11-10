package org.day5;


//Method Overriding
public class SBI {
		public void savings() {
			System.out.println("Savings = 5%");

		}
		public void fixed() {
			System.out.println("Fixed Deposit = 4.5%");

		}
		public static void main(String[] args) {
			SBI b = new SBI();
			
			b.savings();
			b.fixed();
		}
	
}

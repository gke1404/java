package org.day5;

public class ICICI extends SBI{
	private void deposit() {
		System.out.println("Deposit = 75000");

	}
	@Override
	public void savings() {
		System.out.println("Saving = 3%");
	}
	public static void main(String[] args) {
		ICICI i = new ICICI();
		
		i.deposit();
		i.savings();
		i.fixed();
	}
	
}
//If we want to change the value in method , 
//we have to use method overrindig method
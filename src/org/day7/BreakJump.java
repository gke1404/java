package org.day7;


//Jumping Statement
//Break -- will break the statement
public class BreakJump {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Successfull");
	}

}

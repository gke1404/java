package org.day7;


//Jumping Statement
//System.exit() 
public class SysExitJump {

	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			
			
			if (i == 5) {
				System.exit(1); //Terminated here when i == 5(5==5)
			}
			System.out.println(i);
		}
//Will not print becuz System.exit program terminated the statement
		System.out.println("System Successfully Terminated");
	}
}

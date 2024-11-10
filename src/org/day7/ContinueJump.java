package org.day7;

//Jumping Statement
//Continue will hide the iteration
public class ContinueJump {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			if (i == 5) {
				continue; // iteration 5 will not print
			}
			System.out.println(i);
		}
		System.out.println("Successfull");
	}

}

package org.day7;


//Switch Case Statement 

public class SwitchCase {
	
	public static void main(String[] args) {
		
		String day = "mon";
		//case sensitive method			
		switch (day) {
		case "mon":
			System.out.println("Monday");
			//break; 
	//If we put break statement this will end the class here.
	//break is not mandatory here.
		case "tues":
			System.out.println("Tuesday");
			//break;
		case "wed":
			System.out.println("Wednesday");
			//break;
		case "thurs":
			System.out.println("Thursday");
			//break;
		case "fri":
			System.out.println("Friday");
			break;

		default:
			System.out.println("Saturday and Sunday");
			break;
		}
	}

}

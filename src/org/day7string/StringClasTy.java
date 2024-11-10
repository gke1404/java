package org.day7string;

public class StringClasTy {
	
	public static void main(String[] args) {
		
		String s = "java";
		String s1 =" JAVA"; //Space also consider for equalIgnorecase
		
		boolean equals = s.equals(s1);
		System.out.println("String Equals = "+equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println("\nString EqualsIgnoreCase = "+equalsIgnoreCase);
		
		String concat = s.concat(s1);
		System.out.println("\nString Concat = "+concat);
	}

}

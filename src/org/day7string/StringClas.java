package org.day7string;


//String Package

public class StringClas {
	public static void main(String[] args) {
		
		String s = "Java Seleninum Testing Course";
		
		int length = s.length();
		System.out.println("\nLength = "+length);
		
		String uppercase = s.toUpperCase();
		System.out.println("\nUpper Case = "+uppercase);
		
		String lowercase = s.toLowerCase();
		System.out.println("\nLower Case = "+lowercase);
		
		boolean starts = s.startsWith("Java");		
		System.out.println("\nString Starts with Java = "+starts);
		
		boolean ends = s.endsWith("Course");
		System.out.println("\nString Ends with Course = "+ends);
		
		boolean contains = s.contains("Testing");
		System.out.println("\nIt's Contains Testing word = "+contains);
		
		String sub = s.substring(8);
		System.out.println("\nSub String using String Number = "+sub);
		
		String sub2 = s.substring(5, 18);
		System.out.println("\nString using Start and End String Number = "+sub2);
		
		char charAt = s.charAt(5);
		System.out.println("\nCharAt = "+charAt);
		
		int indexOf = s.indexOf('a');
		System.out.println("\nString IndexOf = "+indexOf);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println("\nString LastIndexOf = "+lastIndexOf);
		
		String replace = s.replace("Java", "Python");
		System.out.println("\nString Replace = "+replace);
		
		String replaceAll = s.replaceAll("Testing", "Programming");
		System.out.println("\nString ReplaceAll = "+replaceAll);
	}

}

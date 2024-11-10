package org.day8;


public class StringTyp {
	
	public static void main(String[] args) {
		
		System.out.println("Literal String :");
//Memory location finding method identityhashcode function
//duplicate have same memory location
		String s = "Java"; 
		String s1 = "Selenium";
		String s2 = "Java";
		
	//this way also we can print
		int identityHashCode = System.identityHashCode(s);
		System.out.println(identityHashCode);
	//this way also we can print
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("\nNon-Literal String :");
//duplicate doesn't have same memory location
		
		String a1 = new String("Programe");
		System.out.println(System.identityHashCode(a1));
		
		String a2 = new String("Python");
		System.out.println(System.identityHashCode(a2));
		
		String a3 = new String("Programe");
		System.out.println(System.identityHashCode(a3));
}
}
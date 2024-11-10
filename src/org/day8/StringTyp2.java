package org.day8;

public class StringTyp2 {
	
	public static void main(String[] args) {
		
		System.out.println("Immutable String :");
//different memory location for concat		
		String s = "Java";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		String s1 = "Selenium";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		String s3 = s.concat(s1);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s3));
		
		System.out.println("\nMutable String :");
//Same(a or a1) memory location for concat	
		
// we can use StringBuilder instead of StringBuffer keyword
		StringBuffer a = new StringBuffer("Python");
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		StringBuffer a1 = new StringBuffer("Programe");
		System.out.println(a1);
		System.out.println(System.identityHashCode(a1));
		
		a1 = a1.append(a);
		System.out.println(a1);
		System.out.println(System.identityHashCode(a1));
	}

}

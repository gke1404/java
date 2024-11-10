package org.dayy10;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollecSet1 {
	
	public static void main(String[] args) {
		
		Set s = new LinkedHashSet();
		
		s.add(10);
		s.add(20);
		s.add("Smart");
		s.add(true);
		s.add(null);
		s.add(10);
		
		System.out.println(s);
		
		int size = s.size();
		System.out.println("\nSize :\n"+size);
		
		boolean empty = s.isEmpty();
		System.out.println("\nEmpty or not :\n"+empty);
		
		boolean contain = s.contains("Smart");
		System.out.println("\nContains :\n"+contain);	
		
		System.out.println("\nEnhanced for loop :");
		for(Object i :s) {
			System.out.println(i);
		}
	}

}

package org.dayy10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Collection - Set

public class CollectSet {
	
	public static void main(String[] args) {
		
		Set s = new LinkedHashSet();//Insertion Order
//		Set s = new HashSet();//Random Order

		
		s.add(80);
		s.add(10);
		s.add("Smart");
		s.add(true);
		s.add(23.542f);
		s.add(null);
		s.add(80);
		//duplicate not allowed
		//latest value stores in old data
		
	System.out.println(s);
		
}
	
}

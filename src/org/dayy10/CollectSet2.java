package org.dayy10;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectSet2 {
	
	public static void main(String[] args) {
		
		Set s = new LinkedHashSet();
		
		s.add(10);
		s.add(20);
		s.add("Smart");
		s.add(true);
		s.add(null);
		s.add(10);
		
		System.out.println(s);
		
		List l = new Vector();
		
		l.add("skills");
		l.add(30);
		
		System.out.println(l);
		
		s.addAll(l);
		System.out.println(s);
		
		s.retainAll(l);
		System.out.println(s);
		
		s.removeAll(l);
		System.out.println(s);
		
		boolean eq = s.equals(l);
		System.out.println("\nEquals or not:"+eq);

	}

}

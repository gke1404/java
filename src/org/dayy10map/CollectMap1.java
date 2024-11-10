package org.dayy10map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectMap1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new LinkedHashMap<>();
			
		
		m.put(10, "Java");
		m.put(20, "Selenium");
		m.put(30, "Testing");
		m.put(40, "Course");
		m.put(null, "Python");
		m.put(50, null);
		m.put(40, "Programe");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println("\nSize :\n"+size);
		
		boolean ck = m.containsKey(40);
		System.out.println("\nContains Key :\n"+ck);
		
		boolean cv = m.containsValue("Python");
		System.out.println("\nContains Value :\n"+cv);
		
		Object object = m.remove(50);
		System.out.println("\nRemove without return value :\n"+m);
		System.out.println("\nRemove with return value :\n"+object);
		
		String g = m.get(20);
		System.out.println("\nGet :\n"+g);
		
		boolean empty = m.isEmpty();
		System.out.println("\nEmpty or not :\n"+empty);
		
		Set<Integer> ks = m.keySet();
		System.out.println("\nKeySet :\n"+ks);
		
	    Collection <String> val = m.values();
		System.out.println("\nValue :\n"+val);
//Enhanced For loop for iterate method
		for(String i: val) {
			System.out.println(i);
		}
	
	}
}

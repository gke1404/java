package org.dayy10map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectMap2 {
	
	public static void main(String[] args) {
	
	Map<Integer, String> m = new LinkedHashMap();
		
	m.put(10, "Java");
	m.put(20, "Selenium");
	m.put(30, "Testing");
	m.put(40, "Course");
	m.put(null, "Python");
	m.put(50, null);
	m.put(40, "Programe");

	Set<Entry<Integer, String>> entryset = m.entrySet();
	System.out.println(entryset);
	System.out.println("\nIterate Format Map :\n");
	
	for(Entry<Integer, String> s : entryset) {
		System.out.println(s);
	}
System.out.println("\nEnhanced For loop :\nKeyData");
	
	for(Entry<Integer, String> s1 : entryset) {
		System.out.println(s1.getKey());

	}
System.out.println("\nEnhanced For loop :\nValueData");
	
	for(Entry<Integer, String> s2 : entryset) {
		System.out.println(s2.getValue());

	}
	}
}




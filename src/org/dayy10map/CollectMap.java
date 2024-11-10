package org.dayy10map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Collection - Map

public class CollectMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new LinkedHashMap();//Insertion Order
	//	Map<Integer, String> m = new HashMap();//Random Order
	//	Map<Integer, String> m = new TreeMap();//Key Null not accept
	//	Map<Integer, String> m = new Hashtable();//Key&Value Null not accept
		
		
//		Key 1 null and Value 'n' null accept

		m.put(10, "Java");
		m.put(20, "Selenium");
		m.put(30, "Testing");
		m.put(40, "Course");
		m.put(null, "Python");
		m.put(50, null);
		m.put(40, "Programe");
//		duplicate value replaced with latest value
		System.out.println(m);
	}
}

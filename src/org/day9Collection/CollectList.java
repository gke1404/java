package org.day9Collection;

import java.util.ArrayList;
import java.util.List;

//Collection - List
public class CollectList {
	
		public static void main(String[] args) {
			
			//Upcasting - small to big
			//cast refname = list type
			List li = new ArrayList();
			
			li.add(10);
			li.add("Smart");
			li.add(123.4563f);
			li.add('m');
			li.add(1234566790l);
			li.add("java");
			li.add(null);
			li.add(true);
			li.add(10);
			
		System.out.println(li);
		
		li.add(4, "Selenium");
		System.out.println("\nAdd the value in the middle :\n"+li);

		Object remove = li.remove(4);
		System.out.println("\nRemove the Value :\n"+remove);
		System.out.println("\nRemove the 4th index Position :\n"+li);
		
		li.set(4,"Python");
		System.out.println("\nReplaceing the 4th Position :\n"+li);
		
		int size = li.size();
		System.out.println("\nSize :\n"+size);
		
		boolean empty = li.isEmpty();
		System.out.println("\nEmpty or not :\n"+empty);
		
		int indexOf = li.indexOf("java");
		System.out.println("\nIndexOf :\n"+indexOf);
		
		int lastIndexOf = li.lastIndexOf(true);
		System.out.println("\nLastIndexOf :\n"+lastIndexOf);
		
		Object object = li.get(4);
		System.out.println("\nGet the Value :\n"+object);
		
		
		}
	}

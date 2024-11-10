package org.day9Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectList1 {

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
	//2nd List
			List le = new ArrayList();
			
			le.add(60);
			le.add("skills");
			System.out.println(le);
			
//			li.addAll(le);
//			System.out.println(li);
			
			li.retainAll(le);
			System.out.println("\nCommon Value :\n"+li);

			le.removeAll(li);
			System.out.println("\nCommon Remove the value:\n"+le);
			
			boolean eq = le.equals(li);
			System.out.println("\nEquals :\n"+eq);
			}
		
	}

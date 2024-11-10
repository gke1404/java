package org.dayy10;

import java.util.List;
import java.util.Vector;

//Generics<> Method

public class Gene {

	public static void main(String[] args) {
		
		List<Integer> li = new Vector<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(null);
		
		System.out.println(li);
	}
}

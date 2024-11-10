package org.dayy14;

import java.util.List;
import java.util.LinkedList;

public class encapsuchild {
	
	private void comId() {
		System.out.println("Company Id : 1234");
	}
	public static void main(String[] args) {
		encapsu e = new encapsu();
		
		e.setAge(100);
		e.setName("Smart");
		e.setRoles(1234.5342f);
		
		encapsu e1 = new encapsu();
		e1.setAge(200);
		e1.setName("Skills");
		e1.setRoles(9876.56421f);
		
//		System.out.println(e.getAge());
//		System.out.println(e1.getAge());	
		
		List<encapsu> li = new LinkedList();
		li.add(e); // 0
		li.add(e1);// 1
		
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getAge());
			System.out.println(li.get(i).getName());
			System.out.println(li.get(i).getRoles());
		}
	}

}

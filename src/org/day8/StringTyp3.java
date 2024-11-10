package org.day8;

public class StringTyp3 {
	
	public static void main(String[] args) {
//						0	 1		2
		String s = ("Smart Skills Technology");
		String [] sp = s.split(" ");
		//give space so terminating space
		// if we given any string it'll terminate that
		
//		System.out.println(sp[0]);
		
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
				
	}

}

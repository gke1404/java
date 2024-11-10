package org.day9;

import java.util.Iterator;

//Array

public class Arr {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println(a[0]);
// printing all the array in single call using For Loop
		System.out.println("\nFor Loop Concept:");
		for (int i = 0; i <= 4; i++) {
			
			System.out.println(a[i]);
		}
		
//printing all the array in single call using For Loop
		System.out.println("\nReverse For Loop Concept:");
		for (int i = 4; i >= 0; i--) {
					
			System.out.println(a[i]);
				}
// printing all the array in single call using Enhanced For Loop
		System.out.println("\nEnhanced For Loop Concept:");
		for(int i : a) {
			System.out.println(i);
		}
		
	}
}

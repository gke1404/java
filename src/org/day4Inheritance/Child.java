package org.day4Inheritance;

public class Child implements Parent1, Parent2{
	private void studDept() {
		System.out.println("Student Department : IT");

	}

	@Override
	public void studId() {
		System.out.println("Student Id : 1426j1280");
		
	}

	@Override
	public void studName() {
		System.out.println("Student Name : GK");
		
	}

	@Override
	public void studL() {
		System.out.println("Student Location : Erode");
		
	}

	@Override
	public void studNum() {
		System.out.println("Student Phone Number : 9876543210");
		
	}
	public static void main(String[] args) {
		Child c = new Child();
		
		c.studName();
		c.studId();
		c.studDept();
		c.studNum();
		c.studL();
	}

}
//Multiple Inheritance using Interface method
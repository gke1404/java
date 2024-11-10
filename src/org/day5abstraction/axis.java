package org.day5abstraction;

public class axis implements FaceInter{
	
	private void empName() {
		System.out.println("Employee Name : GK");

	}

	@Override
	public void salary() {
		System.out.println("Employee Salary : 10LPA");
		
	}

	@Override
	public void empId() {
		System.out.println("Employee Id: 1426j1280");
		
	}
	public static void main(String[] args) {
	axis a = new axis();
	
	a.empName();
	a.empId();
	a.salary();
	}
	

}

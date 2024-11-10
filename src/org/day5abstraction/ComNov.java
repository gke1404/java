package org.day5abstraction;

public class ComNov extends ComDetail{
	private void comAddress() {
		System.out.println("Company Address : Chennai");

	}

	@Override
	public void comName() {
		System.out.println("Company Namy : Smart Skills");
	}

	@Override
	public void comLol() {
		System.out.println("Company Location : Tamilnadu");
		
	}
	public static void main(String[] args) {
		ComNov cn = new ComNov();
		
		cn.comName();
		cn.comId();
		cn.comLol();
		cn.comAddress();
	}

}

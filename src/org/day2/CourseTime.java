package org.day2;

import org.course.FirstClassTesting;//Different Package and Different Class

//Same Package Different Class

public class CourseTime {
	
	private void stud() {
		
		System.out.println("GK");		
	}
	public static void main(String[] args) {
		CourseTime c = new CourseTime();
		c.stud();
		CourseDetails c1 = new CourseDetails();
		c1.javacourse();
		c1.pythoncourse();
		//Different Package and Different Class
		FirstClassTesting f = new FirstClassTesting();
		f.javacourse();
		f.pythoncourse();
	}
	
}

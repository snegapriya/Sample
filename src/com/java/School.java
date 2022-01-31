package com.java;
//child class
public class School extends Student{

	public static void main(String[] args) {
		
		Student s = new Student();
	//	s.studentName();
		
		//parent         child
		Student s1 = new School();//upcasting
	//	s1.studentName();
		
		//child         parent
	//	School s2 = new Student();//downcasting 
		
		
	}
}

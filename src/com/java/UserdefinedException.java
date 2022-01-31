package com.java;

public class UserdefinedException {

	public static void validate(int age) throws Exception,Throwable {

		if (age>=18) {
			
			System.out.println("Eligible for vote");
		} 
		else {

			throw new Exception("Not Eligible for vote");
		}
		
	}	
	
	public static void main(String[] args) throws Throwable {
		
		validate(13);
		
		
		
		
		
		
		
		
		
		
		
	}
}

package com.java;

public class UserDefined {

	public static void validate(int age) throws Exception,Throwable{

		if (age>=18) {
			
			System.out.println("Eligible For Vote");
		} 
		else {

            throw new Exception("Not Eligible For Vote");
		}
	}
	public static void main(String[] args) throws Throwable {
		
		validate(13);
		
	}
}

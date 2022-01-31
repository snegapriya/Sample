package com.java;

public class Exception_Handling {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			
			int b = 0;
			
			System.out.println(a/b);
		} 
		catch (NullPointerException e) {

			e.printStackTrace();
		//	System.out.println(e);
		}
		catch (ArithmeticException e) {

			e.printStackTrace();
		}
		catch (Exception e) {

			e.printStackTrace();
		}	
		finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("Java Code");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

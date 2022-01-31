package com.java;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int a = 10;

			int b = 0;

			System.out.println(a / b);
		} 
		catch (NullPointerException e) {

			e.printStackTrace();
			// System.out.println(e);
		}
		catch (ArithmeticException e) {

			e.printStackTrace();
			// System.out.println(e);
		}
		catch (Exception e) {

			e.printStackTrace();
			// System.out.println(e);
		}

		finally {
			System.out.println("Finally Block");
		}

		System.out.println("Java code");

	}
}

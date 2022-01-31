package com.java;

public class SwitchExample {

	public static void main(String[] args) {

		int a = 1;

		switch (a) {

		case 1:
            System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("Holiday");
			break;
		}
	}

}

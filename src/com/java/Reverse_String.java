package com.java;

public class Reverse_String {

	public static void main(String[] args) {
		
		
	/*	String s = "Welcome to java";
		
		String rev = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			
			char c = s.charAt(i);
			   rev =  rev+c;
			//   System.out.println(rev);
		}
		
		System.out.println(rev); */
		
		
		//java to welcome
		
		String s = "Welcome to java";
		
		String[] spl = s.split(" ");
		
		for (int i = spl.length-1; i>=0; i--) {
			
			System.out.print(spl[i]+" ");
		}


		
		
		
	}
}

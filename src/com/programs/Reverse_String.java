package com.programs;

public class Reverse_String {

	public static void main(String[] args) {
		
	/*	String s = "welcome";
		
		//output - emoclew
		
		String rev = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			char c = s.charAt(i);
			   rev = rev + c; //e+m=em //em+o=emo //emo+c=emoc //emoc+l=emocl //emocl+e=emocle //
			   System.out.println(rev);     //emocle+w=emoclew
		}
		
	//	System.out.println(rev); */
		
		
		String s = "Welcome to java";
		
		//output = java to welcome
		
		String[] spl = s.split(" ");
		
		for (int i = spl.length-1; i >= 0; i--) {
			
			System.out.print(spl[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

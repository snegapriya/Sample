package com.java;

public class Naukri  extends Email{
	
	@Override              //annotation
	public void name(String name) {
		super.name(name);   //super ---->keyword  (parent class reference)
	}
	@Override
	public void mobile(int num) {
		super.mobile(num);
	}
	public static void main(String[] args) {
		Naukri  obj = new Naukri();
		obj.name("jim");
		obj.mobile(1234567890);
	}

}

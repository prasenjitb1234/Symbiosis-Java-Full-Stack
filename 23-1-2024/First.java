package com.instagram.login;

public class First {
	
	int a = 10;   //a is  global variable 
	public void m1(int b) {     // b is local variable 
		b = 30;
		System.out.println(a);
	}
	
	public void m2() {
//		System.out.println(b); 
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
	}
}

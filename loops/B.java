package com.mydata;

public class B {
	// static block 
	{
		System.out.println("Inside static block ");
	}
	public void m1() {
		B ab = new B();
		System.out.println("ml");
	}
	public static void main(String args[]) {
		B ab = new B();
		ab.m1();
	}
}

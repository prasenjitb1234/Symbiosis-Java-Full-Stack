// static ---- Non static
// non static --- non static 
// non static --- static   ------- X
// static --- non static 

package com.mydata;

public class A {

	int a = 10;
	
	public  void m1() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		A ab = new A();
		ab.m1();
		
	}
}


package com.instagram.login;

public class kbp2 {
	int a = 10;
	int b = 340; 
	
	public void getAddition() {
		int sum = a + b;
		System.out.println(sum);
	}
	public void getSubtraction() {
		int sub = a - b;
		System.out.println(sub);
		
	}
	public void getProduct() {
		int mul = a * b;
		System.out.println(mul);
	}
	public void getDivision() {
		int div = a / b;
		System.out.println(div);
	}

	
	public static void main(String[] args) {
		
		kbp2 obj = new kbp2();
		obj.getAddition(); 
		obj.getSubtraction();
		obj.getProduct();
		obj.getDivision();
		
		
		
	}
}

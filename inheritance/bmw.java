package com.inherit;
import java.util.Scanner;
public class bmw {

	
	public static void setbmw() {
		System.out.println("No 2 company...");
		System.out.println("No 2 Saftey...");
		System.out.println("Press1.X5.");
		System.out.println("Press2.X6.");
		
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Wellcome to X5...");
			x5.setx5();
			break;
		case 2:
			System.out.println("Wellcome to X6...");
			x6.setx6();
			break;
		default:
			System.out.println("Invalid input ..");
	}
	
}
}
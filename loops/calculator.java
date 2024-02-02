package com.mydata;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		System.out.println("Calculator : : /n/n");
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		int choice = sc.nextInt();
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		
		
		
		
		switch(choice) {
		case 1: 
			result = num1 + num2;
			System.out.println(result+" ");
			break;
		case 2: 
			result = num1 - num2;
			System.out.println(result+" ");
			break;
		case 3: 
			result = num1 * num2;
			System.out.println(result+" ");
			break;
		case 4: 
			result = num1 / num2;
			System.out.println(result+" ");
			break;
		default:
			System.out.println("Invalid option");
		}
		
		
		
		
		
	}
}

package com.cars;
import java.util.Scanner;
public class cars {
	
	static{
		System.out.println("Choose your car company");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for TATA \n 2 for Toyota \n 3 for Mahindra");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Welcome to Tata");
			Operations.getTata();
			break;
		case 2:
			System.out.println("Welcome to Toyota");
			Operations.getToyota();   
			break;
		case 3:
			System.out.println("Welcome to Mahindra");
			Operations.getMahindra(); 
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		
		
		
		
		
		
		
	}
	
	
}

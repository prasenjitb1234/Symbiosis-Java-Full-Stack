package com.inherit;
import java.util.Scanner;
public class Tata extends car{

	static public void setTata(){
		System.out.println("No 1 company...");
		System.out.println("No 1 Saftey...");
		System.out.println("choose car");
		System.out.println("Press1.Altroz.");
		System.out.println("Press2.Safari.");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Wellcome to Altroz...");
			Altroz.setAltroz();
			break;
		case 2:
			System.out.println("Wellcome to Safari...");
			safari.setsafari(); 
			break;
		default:
			System.out.println("Invalid input ..");
		}
	}
	
}

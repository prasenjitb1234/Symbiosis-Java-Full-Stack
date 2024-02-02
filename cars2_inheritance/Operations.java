package com.cars;
import java.util.Scanner;
public class Operations {

	public static void getTata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Altroz\n 2 for Harrier \n 3 for Safari ");
		int ch = sc.nextInt();
		Tata td = new Tata();
		
		switch(ch) {
		case 1:
			td.getAltrozInfo();
			break;
		case 2:
			td.getSafariInfo();
			break;
		default:
			System.out.println("invalid option");
		}
	}
		
		public static void getToyota() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 for Altroz\n 2 for Harrier \n 3 for Safari ");
			int ch = sc.nextInt();
			Toyota ty = new Toyota();
			
			switch(ch) {
			case 1:
				ty.getAltrozInfo();
				break;
			case 2:
				ty.getSafariInfo();
				break;
			default:
				System.out.println("Invalid option");
			}
			
		}
		
			
			public static void getMahindra() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Press 1 for Altroz\n 2 for Harrier \n 3 for Safari ");
				int ch = sc.nextInt();
				Mahindra mh = new Mahindra();
				
				switch(ch) {
				case 1:
					mh.getAltrozInfo();
					break;
				case 2:
					mh.getSafariInfo();
					break;
				default:
					System.out.println("Invalid option");
				}
		
		
		
		
		
	}

}

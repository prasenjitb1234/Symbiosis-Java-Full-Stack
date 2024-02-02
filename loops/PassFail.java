package com.mydata;
import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks ");
		int marks = sc.nextInt();
		
		if (marks > 75) {
            System.out.println("distinction");
        }else if (marks >= 60 && marks <= 75) {
            System.out.println("first Class");
        }else if (marks >= 50 && marks < 60) {
            System.out.println("second Class");
        }else if (marks >=35 && marks < 50) {
        	System.out.println("pass");
        }else {
        	System.out.println("fail");
        }
		
            
            
            
	}
}

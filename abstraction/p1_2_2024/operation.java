package p1_2_2024;
import java.util.*;
public class operation {

	public void tatainfo() {
		
		
		System.out.println("choose car");
		System.out.println("Press1.Altroz.");
		System.out.println("Press2.Safari.");
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Wellcome to Altroz...");
			altroz al=new altroz();
			al.gettatadata();
			al.getcolor();
			al.getfeature();
			al.getmiliage();
			al.getprice();
			break;
		case 2:
			System.out.println("Wellcome to Harrier...");
			harrier h =new harrier();
			h.gettatadata();
			h.getcolor();
			h.getfeature();
			h.getmiliage();
			h.getprice();
			
			break;
		default:
			System.out.println("Invalid input ..");
		}}
		public void bmwinfo() {
			
			
			System.out.println("choose car");
			System.out.println("Press1.X5.");
			System.out.println("Press2.X6.");
			Scanner sc=new Scanner(System.in);
			int j=sc.nextInt();
			switch(j) {
			case 1:
				System.out.println("Wellcome to x5...");
				x5 x1=new x5();
				x1.getbmwdata();
				x1.getcolor();
				x1.getfeature();
				x1.getmiliage();
				x1.getprice();
				break;
			case 2:
				System.out.println("Wellcome to x6...");
				harrier h =new harrier();
				h.gettatadata();
				h.getcolor();
				h.getfeature();
				h.getmiliage();
				h.getprice();
				
				break;
			default:
				System.out.println("Invalid input ..");
			}
		
	
}
		 public void msinfo() {
			
			
			System.out.println("choose car");
			System.out.println("Press1.swift.");
			System.out.println("Press2.balleno.");
			Scanner sc=new Scanner(System.in);
			int jk=sc.nextInt();
			switch(jk) {
			case 1:
				System.out.println("Wellcome to swift...");
				x5 x1=new x5();
				x1.getbmwdata();
				x1.getcolor();
				x1.getfeature();
				x1.getmiliage();
				x1.getprice();
				break;
			case 2:
				System.out.println("Wellcome to balleno...");
				harrier h =new harrier();
				h.gettatadata();
				h.getcolor();
				h.getfeature();
				h.getmiliage();
				h.getprice();
				
				break;
			default:
				System.out.println("Invalid input ..");
			}
	
	
}
public static void main() {
	System.out.println("Wellcome to Aman's car....");
	System.out.println("choose for car company..");
	System.out.println("press 1. maruti");
	System.out.println("press 2.tata");
	System.out.println("press 3.bmw");
	Scanner sc=new Scanner(System.in);
	int b=sc.nextInt();
	operation or =new operation();
	switch(b) {
	case 1:
		System.out.println("Wellcome to tata");
		or.tatainfo();
		break;
	    
	case 2:
		System.out.println("Wellcome to BMW");
		or.bmwinfo();
		break;
	case 3:
		System.out.println("Wellcome to Maruti");
		or.msinfo();
		break;
	
	
	
	default:
		System.out.println("Invalid option....");
		break;
	
	}}
	
	
	
	
}

package mytest.inherit;

public class Test extends Raj{
	public static void main(String args[]) {
		
		//
		System.out.println("Inheritance example : ");
		Prasenjit ps = new Prasenjit();
		
		ps.setMango();
		
		Raj rj = new Raj();
		rj.setOrange();
		rj.setMango();
		
	}
}

package com.te.challenges;

public class Program2 {
	public double area(double rad) {
		
	  double a;
		if(rad>0) {
		 a=3.14*rad*rad;
		 return a;
		}
	
		else {
			return -1;
		}
	}
	
	public double area(double x,double y) {
		double b;
		if(x>0&&y>0) {
			b=x*y;
		
		
		return b;
		}
		else {
			return -1;
		}
		
	}
	

	public static void main(String[] args) {
		Program2 p = new Program2();
		System.out.println("area is"+p.area(10.0,2.5));
		System.out.println("area is"+p.area(10.0));
		

		
		

	}

}

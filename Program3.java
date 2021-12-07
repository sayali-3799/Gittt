package com.te.challenges;

import java.util.Scanner;

public class Program3 {
	public static void printEqual(int a,int b,int c) {
		if(a<0||b<0||c<0) {
			System.out.println("invalid value");
		}else if(a==b&&a==c&&b==c) {
			System.out.println("all are equal");
			
		}else if(a!=b && b!=c && a!=c) {
			System.out.println("all are different");
		}
		else {
			System.out.println("neither all are equal or different");
		}
	}
	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();
	System.out.println("enter third number");
	int c=sc.nextInt();
	printEqual(a,b,c);
	
	
	}

}

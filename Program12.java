package com.te.challenges;

import java.util.Scanner;

public class Program12 {
	 static void printFactors(int number){
	    	if(number>=1) {
	    		for(int i=1;i<=number;i++) {
	    			if(number%i==0) {
	    				System.out.println(i);
	    			}
	    		}
	    	}
	    	else
	    		System.out.println("invalid value");;
	    }
	    

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number");
	int a=scanner.nextInt();
	printFactors(a);

	}

}

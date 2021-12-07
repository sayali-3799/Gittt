package com.te.challenges;

import java.util.Scanner;

public class Program9 {
	public static int getEvenDigitSum(int number) {
		int sum=0;
	
		if(number<0) {
		return -1;
		
		
	}
		else {
			for(int i=1;i<=number;i++) {
				if(i%2==0) {
					sum=sum+i;
				}
			}
			return sum;
			
		}
			
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int a=scanner.nextInt();
		System.out.println(getEvenDigitSum(a));
	

	}

}

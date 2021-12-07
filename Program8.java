
package com.te.challenges;

import java.util.Scanner;

public class Program8 {
	public static int sumFirstAndLastDigit(int number) {
		if(number<=0){
			return -1;
		}
		int sum=0;
		int last=0;
		int first=0;
		last=number%10;
		while(number!=0) {
			first=number%10;
			number=number/10;
		}
		sum=last+first;
		
		return sum;
	
	}
	
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int a=scanner.nextInt();
		System.out.println(sumFirstAndLastDigit(a));

	}

}

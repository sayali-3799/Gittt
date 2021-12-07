package com.te.challenges;

import java.util.Scanner;

public class Program11 {

		public static boolean hasSharedDigit(int number){
			int last_digitnumber = number%10;
			number/=10;
			if(number==last_digitnumber){
				return true;
			}
			else{
				return false;
			}
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int number= scan.nextInt();
		
		System.out.println(hasSharedDigit(number));
		if(number<99 && number>9 ){
			boolean result = hasSharedDigit(number);
			if(result){
				System.out.println("Has same digit");
			}
			else{
				System.out.println("Not have same digit");
			}
		}
	}
		
		
		
		
	




	}


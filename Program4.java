package com.te.challenges;

import java.util.Scanner;

public class Program4 {
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (summer==summer && temperature >= 25 && temperature <= 45) {
			
			System.out.println("cat is playing");

			return true;
		} else if(summer!=summer&& temperature>=25&&temperature<=35){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature");
		int a = sc.nextInt();
		System.out.println("enter season");
		String season=sc.next();
		System.out.println(isCatPlaying(false, a));

	}

}


package com.te.challenges;

import java.util.Scanner;

public class Program7 {
	public static boolean isOdd(int number) {
		if (number >= 0) {
			return true;

		} else {
			return false;
		}
	}

	public static int sumOdd(int start, int end) {

		if (end <= 0 && start <= 0) {
			return -1;
		} else {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				if (i % 2 != 0) {
					isOdd(i);
					if (true) {
						sum = sum + i;
					}

				}

			}
			return sum;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number");
		int a = sc.nextInt();
		System.out.println("enter end element");
		int b = sc.nextInt();
		System.out.println(sumOdd(a, b));

	}

}

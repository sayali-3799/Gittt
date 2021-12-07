package com.te.challenges;

public class Program10 {
	public static boolean hasShareDigit(int x,int y) {
		int firstdigit = x / 10;
		int last= x % 10;
		int secondfirst = y / 10;
		int secondlast = y % 10;
		boolean result=true;
		

		if(!(x>=10&&x<=99&&y>=10&&y<=99)) {
			return false;
		}
		
			
		else if (firstdigit == secondfirst || firstdigit == secondlast
					|| last == secondlast) {
			result=true;
			}
			else {
				result=false;
			}
		return result;

		}

	

	public static void main(String[] args) {

		System.out.println(hasShareDigit(21,78));
	}

}


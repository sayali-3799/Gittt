package com.te.challenges;



public class Program13 {
	static void numberToWords(int number) {
		String one[]= {" ","one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twevel","thirteen","fourteen",
				"fifteen","sixteen","seventeen","eightteen","nineteen"
		};
		String two[]= {" "," ","twenty","thirty","fourty","fifty","sixty","seventy",
				"eighty","ninety"
		};
		if(number<20) {
			System.out.println(one[number]);
		}
		else if(number>=20)
			System.out.println(two[number/10]+one[number%10]);
		
	}
		
	
	public static void main(String[] args) {
		numberToWords(25);
	}

}




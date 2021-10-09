package com.qa.iteration;

public class Flowcharts {

	public static void flow1() {
		for (int A = 100; A < 200; A++) {
			System.out.println(A);
		}
	}

	public static void flow2() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println(A + " -");
			} else {
				System.out.println(A + " *");
			}
		}

	}

	public static void flow3() {
		for (int i = 1; i <= 10; i++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(y);
			}
		}
	}

	public static void flow4() {
		for (int i = 0; i <= 10; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.println(i);
			}
		}
	}
//	public static void coins(float val1, float val2) {
//		float change = val2 - val1;
//		int onep = 0;
//		int twop = 0;
//		int fivep = 0;
//		int tenp = 0;
//		int twentyp = 0;
//		int fiftyp = 0;
//		int onePound = 0;
//		int twoPound = 0;
//		int fivePound = 0;
//		int tenPound = 0;
//		int twentyPound = 0;
//		while (change > 20f) {
//			twentyPound++;
//			change -= 20f;
//		}
//	}
	public static String intToText(int num) {
		String[] ones = {"zero","-one","-two","-three","-four","-five","-six","-seven","-eight","-nine","-ten"};
		String[] teens = {"null","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens = {"null","null","Twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		if (num < 11) {
			return ones[num];
		}else if (num <20) {
			return teens[num / 10];
		}
		else if (num == 100) {
			return "one hundred";
		}else {
			return tens[num / 10] + ones[num % 10];
		}
	}
}

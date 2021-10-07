package com.qa.black;

public class Blackjack {

	public static int blackjack(int num1, int num2) {
		if (num1 > 0 && num2 > 0) {
			if (num1 > num2 && num1 < 21) {
				return num1;
			}
			else if (num2 >num1 && num2 < 21) {
				return num2;
			}else {
				return 0;
			}
		}else {
			return 0;
		}
	}

}

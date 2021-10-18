package com.qa.black;



public class Blackjack {
	
	public int num1;
	public int num2;
	

	public Blackjack(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int blackjack() {
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

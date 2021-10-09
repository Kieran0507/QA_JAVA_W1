package com.qa.flow;

import java.util.Random;

public class DiceRoller {

	public static int getRandNum(int num) {
	
		new Random().nextInt(num);
		int num1 = num += 1;
		return  num1;
	}

}

package com.qa.iteration;

import java.util.Random;

public class IterationMethods {

//	public static void cashmoney(int num) {
//		int money = num;
//		while (money > 150) {
//			money -= 40;
//			System.out.println("Amount left " + money);
//		}
//	
//		System.out.println("Stop spending money");
//	}

		public int num;
	
	public IterationMethods(int num) {
	super();
	this.num = num;
}

	public void cashmoney() {
		Random random = new Random();
		int spent = random.nextInt(40);
		int money = num;
		while (money > 150) {
			money -= spent;
			System.out.println("Amount left " + money);
		}
	
		System.out.println("Stop spending money");
		return;
	}

}

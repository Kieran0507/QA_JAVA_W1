package com.qa.flowchart;

public class Flowchart {

	public static int demoExample (int num1, int num2, boolean boo ) {
		if (boo) {
		return	num1 + num2;
		}else {
			return num1 * num2;
		}
	}
	public static void flowChart(int A) {
		if (A > 2000) {
			System.out.println("A");
		}else {
			System.out.println("1");
		}
		if (A > 100) {
			System.out.println("3");
		}else {
			System.out.println("2");
		}
		if (A > 6000) {
			System.out.println("C");
		}else {
			System.out.println("B");
		}
		if (A > 600) {
			System.out.println("5");
		}else {
			System.out.println("4");
		}
		if (A > 4000) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		if (A > 500) {
			System.out.println("6");
		}else {
			System.out.println("7");
		}
	}	
}

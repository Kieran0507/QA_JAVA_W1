package com.qa.arrays;

public class ArrayDemo {

//	public static void arrayDemo() {
//		String[] name = {"Bob","Kevin","Fred","Dillan"};
//		char[] favLetter = {'f','g','h','k'};
//		int[] favNumber = {1,2,3,4};
//		boolean[] likesPineappleOnPizza = {true,false,true,false};
//		String[] emptyName = new String[4]; 
//	}
	public static void arraySquared() {
		int[] numArray = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < 10; i++ ) {
			int x = i + 1;
			System.out.println(numArray[i] * x);
		}
			
		}
	public static void arraySquaredStretch() {
		int[] squaredArray = new int[10];
		int[] numArray = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < 10; i++ ) {
			int x = i + 1;
			squaredArray[i] = numArray[i] * x;
			System.out.println(squaredArray[i]);
		} 
			
		}
	public static void arraySquaredStretch2() {
		int[] squaredArray = new int[10];
		int[] numArray = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 9; i >= 0; i-- ) {
			int x = i + 1;
			squaredArray[i] = numArray[i] * x;
			System.out.println(squaredArray[i]);
		} 
			
		}
	
}

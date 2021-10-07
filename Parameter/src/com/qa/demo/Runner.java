package com.qa.demo;

public class Runner {
	
	public static void main(String[] args) {
		printInt(6);
		printString("this is a string");
		printFloat(2.55f);
		printBooFlt(true, 2.56f);
		printFltStr(2.57f, "-this is a string");
		print3('f', false, 6);
		printSum(5, 7);
	}
	public static void printInt(int num) {
		System.out.println("Im printing an int " + num);
	}
	public static void printString(String str) {
		System.out.println("-Im printing a String " + str);
	}
	public static void printFloat(float flt) {
		System.out.println("Im printing a Float " + flt);
	}
	public static void printBooFlt(boolean boo, float flt2) {
		System.out.println("This is a boolean " + boo + ". This is a float " + flt2);
	}
	public static void printFltStr(float flt3, String str2) {
		System.out.println("I passed in a float " + flt3 + ". I passed in a string " + str2);
	}
	public static void print3(char chr, boolean boo1, int int1) {
		System.out.println("This method has 3 parameters char = " + chr + " boolean = " + boo1 + " int = " + int1); 
	}
	public static void printSum(int int1, int int2) {
		System.out.println(int1 + int2);
	}
}

package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		System.out.println(ReturnTypes.returnString());
		System.out.println(ReturnTypes.returnInt());
		System.out.println(ReturnTypes.returnBoolean());
		System.out.println(ReturnTypes.returnChar());
		System.out.println(ReturnTypes.returnFloat());
		System.out.println(Integer.parseInt(ReturnTypes.stringToNumber())); 
	}
	


}

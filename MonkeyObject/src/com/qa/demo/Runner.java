package com.qa.demo;

import com.qa.monkey.Monkey;

public class Runner {

	public static void main(String[] args) {
		Monkey ape = new Monkey();
		System.out.println(ape.getMainFood());
		Monkey george = new Monkey("pasta", true, false);
		System.out.println(george.toString());
		Monkey harambe = new Monkey ("lettuce", 2, false, false);
		harambe.setMainFood("");
		System.out.println(harambe.toString());
	}

}

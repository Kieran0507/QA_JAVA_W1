package com.qa.demo;

import com.qa.black.Blackjack;

public class Runner {

	public static void main(String[] args) {
//		System.out.print(Blackjack.blackjack(22, 25));
		Blackjack game = new Blackjack(5, 20);
		System.out.println(game.blackjack()); 
	}
	

}

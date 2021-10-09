package com.qa.runner;

import com.qa.arrays.ArrayDemo;
import com.qa.arrays.Arraylists;

public class Runner {

	public static void main(String[] args) {
//		Arrays.arraySquared();
//		Arrays.arraySquaredStretch();
//		ArrayDemo.arraySquaredStretch2();
		Arraylists.newOrder("large Cold Brew w/ double shot");
		Arraylists.amountOrders();
		System.out.println(Arraylists.orders);
		
	}
}
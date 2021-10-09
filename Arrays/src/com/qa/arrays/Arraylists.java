package com.qa.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylists {
//
//	public static ArrayList<String> pizzaList = new ArrayList<>();
////	can use pizzaList.add .remove(i) .get(i) 
	public static ArrayList<String> orders = new ArrayList<>(Arrays.asList("Small Espresso w/ Chocolate"));
	public static ArrayList<String> DoneOrders = new ArrayList<>();
	
	public static String newOrder(String ord) {
		orders.add(0, ord);
		return orders.get(0);
	}
	public static void finOrder() {
		DoneOrders.add(orders.get(orders.size() - 1));
		orders.remove(orders.size()- 1);
	}
	public static void amountOrders() {
		System.out.println(orders.size());
	}
	public static void amountDoneOrders() {
		System.out.println(DoneOrders.size());
	}
	public static void clearOrders() {
		orders.clear();
	}
	public static void clearDoneOrders() {
		DoneOrders.clear();
	}
	public static void clearBoth() {
		orders.clear();
		DoneOrders.clear();
	}

}

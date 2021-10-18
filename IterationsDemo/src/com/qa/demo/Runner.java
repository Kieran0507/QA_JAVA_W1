package com.qa.demo;

import com.qa.iteration.Flowcharts;
import com.qa.iteration.IterationMethods;
//import com.qa.iteration.IterationMethods;

public class Runner {

	public static void main(String[] args) {
//		IterationMethods.cashmoney(500);
//		Flowcharts.flow2();
//		Flowcharts.flow3();
//		Flowcharts.flow4();
//		System.out.println(Flowcharts.intToText()); 
		Flowcharts oddEven = new Flowcharts();
		oddEven.flow3();
		IterationMethods cash = new IterationMethods(500);
		IterationMethods $ash = new IterationMethods(825);
		cash.cashmoney();
		$ash.cashmoney();
	}
	
}

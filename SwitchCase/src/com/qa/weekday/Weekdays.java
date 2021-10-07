package com.qa.weekday;

public class Weekdays {

	public static void wd (int dayNum) {
		switch (dayNum) {
		case 1:
			System.out.println("It is a Monday!");
			break;
		case 2:
			System.out.println("It is a Tuesday!");
			break;
		case 3:
			System.out.println("It is a Wednesday!");
			break;
		case 4:
			System.out.println("It is a Thursday!");
			break;
		case 5:
			System.out.println("It is a Friday!");
			break;
		case 6:
			System.out.println("It is a Saturday!");
			break;
		case 7:
			System.out.println("It is a Sunday!");
			break;
		default:
			System.out.println("Theres only 7 days in a week");
		}
	}
	

}

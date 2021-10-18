package com.qa.monkey;

public class Monkey {

	private String mainFood;
	private int numberOfEyes;
	private boolean hasHair;
	private boolean isInZoo;
	
	public Monkey() {
		this.mainFood = "Bananas";
		this.numberOfEyes = 2;
		this.hasHair = true;
		this.isInZoo = true;
	}

	public Monkey(String mainFood, int numberOfEyes, boolean isInZoo) {
		super();
		this.mainFood = mainFood;
		this.numberOfEyes = numberOfEyes;
		this.isInZoo = isInZoo;
	}

	public Monkey(String mainFood, int numberOfEyes, boolean hasHair, boolean isInZoo) {
		super();
		this.mainFood = mainFood;
		this.numberOfEyes = numberOfEyes;
		this.hasHair = hasHair;
		this.isInZoo = isInZoo;
	}

	public Monkey(String mainFood, boolean hasHair, boolean isInZoo) {
		super();
		this.mainFood = mainFood;
		this.hasHair = hasHair;
		this.isInZoo = isInZoo;
	}

	public String getMainFood() {
		return mainFood;
	}

	public void setMainFood(String mainFood) {
		this.mainFood = mainFood;
	}

	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}

	public boolean isHasHair() {
		return hasHair;                                                                                                                                                  
	}

	public void setHasHair(boolean hasHair) {
		this.hasHair = hasHair;
	}

	public boolean isInZoo() {
		return isInZoo;
	}

	public void setInZoo(boolean isInZoo) {
		this.isInZoo = isInZoo;
	}

	@Override
	public String toString() {
		return "Monkey [mainFood=" + mainFood + ", numberOfEyes=" + numberOfEyes + ", hasHair=" + hasHair + ", isInZoo="
				+ isInZoo + "]";
	}
	
	

}

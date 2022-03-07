package com.barista.dto;

public class Ingredient {

	private String name;
	private double availableUnits;
	private double costPerUnit;
	
	public static double MAX_AVAILABLE_UNITS = 10.0;
	
	public static String COFFEE = "coffee";
	public static String DECAF = "decaf";
	public static String SUGAR = "sugar";
	public static String CREAM = "cream";
	public static String STEAMED_MILK = "steamMilk";
	public static String FOAMED_MILK = "foamMilk";
	public static String ESPRESSO = "espresso";
	public static String COCOA = "cocoa";
	public static String WHIPPED_CREAM = "whippedCream";

	
	public Ingredient(String name, double availableUnits, double costPerUnit) {
		super();
		this.name = name;
		this.availableUnits = availableUnits;
		this.costPerUnit = costPerUnit;
	}


	public String getName() {
		return name;
	}


//	public void setName(String name) {
//		this.name = name;
//	}


	public double getAvailableUnits() {
		return availableUnits;
	}
//
//
	public void setAvailableUnits(double availableUnits) {
		this.availableUnits = availableUnits;
	}
//
//
	public double getCostPerUnit() {
		return costPerUnit;
	}

//	public void setCostPerUnit(double costPerUnit) {
//		this.costPerUnit = costPerUnit;
//	}

}

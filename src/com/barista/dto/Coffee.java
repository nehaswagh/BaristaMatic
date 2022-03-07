package com.barista.dto;
import java.text.NumberFormat;
import java.util.List;

public abstract class Coffee {
	
	List<Ingredient> ingredients;
	int units = 0;
	double pricePerUnit = 0.0D;
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
	public void dispense() {};
	public String getDrinkName() {return "";};
	

	/**
	 * @return
	 */
	public String getCost() {
		double totalCost=0.0D;
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		for (Ingredient ing: ingredients) {
			totalCost += ing.getAvailableUnits() * ing.getCostPerUnit();
		}
		return formatter.format(totalCost);
	}

}

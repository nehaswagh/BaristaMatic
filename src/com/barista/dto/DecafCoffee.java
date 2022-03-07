package com.barista.dto;
import java.util.ArrayList;
import java.util.List;

public class DecafCoffee extends Coffee {
	
	public DecafCoffee() {
		ingredients = new ArrayList<Ingredient>();
		ingredients.add(new Ingredient(Ingredient.DECAF, 3.0, 0.75));
		ingredients.add(new Ingredient(Ingredient.SUGAR, 1.0, 0.25));
		ingredients.add(new Ingredient(Ingredient.CREAM, 1.0, 0.25));
	}

	@Override
	public List<Ingredient> getIngredients() {	
		
		return ingredients;
	}

	@Override
	public void dispense() {
		System.out.println("Dispensing: " + getDrinkName());
	}

	@Override
	public String getDrinkName() {
		return "Decaf Coffee";
	}

}

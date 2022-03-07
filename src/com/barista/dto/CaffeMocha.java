package com.barista.dto;

import java.util.ArrayList;
import java.util.List;

public class CaffeMocha extends Coffee {
	
	public CaffeMocha() {
		ingredients = new ArrayList<Ingredient>();
		ingredients.add(new Ingredient(Ingredient.ESPRESSO, 1.0, 1.10));
		ingredients.add(new Ingredient(Ingredient.COCOA, 1.0, 0.90));
		ingredients.add(new Ingredient(Ingredient.STEAMED_MILK, 1.0, 0.35));
		ingredients.add(new Ingredient(Ingredient.WHIPPED_CREAM, 1.0, 1.00));
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

		return "Caffe Mocha";
	}

}

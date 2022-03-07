package com.barista.dto;

import java.util.ArrayList;
import java.util.List;

public class CaffeLatte extends Coffee {
	
	public CaffeLatte() {
		ingredients = new ArrayList<Ingredient>();
		ingredients.add(new Ingredient(Ingredient.ESPRESSO, 2.0, 1.10));
		ingredients.add(new Ingredient(Ingredient.STEAMED_MILK, 1.0, 0.35));
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

		return "Caffe Latte";
	}

}

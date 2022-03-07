package com.barista.dto;

import java.util.ArrayList;
import java.util.List;

public class CaffeAmericano extends Coffee {
	
	public CaffeAmericano() {
		ingredients = new ArrayList<Ingredient>();
		ingredients.add(new Ingredient(Ingredient.ESPRESSO, 3.0, 1.10));
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

		return "Caffe Americano";
	}

}

package com.barista.service;

import java.util.List;

import com.barista.dto.Coffee;
import com.barista.dto.Ingredient;

public class BaristaService {
	
	private static BaristaService bar;
	//Create Singleton BaristaService Instance
	public static BaristaService getInstance() {
        if(bar == null) {
            bar = new BaristaService();
        }
        
        return bar;
    }
	
	InventoryService invService = InventoryService.getInstance();
	/**
	 * @param coffee
	 */
	public void makeCoffee(Coffee coffee) {
		
		List<Ingredient> ingredients = coffee.getIngredients();
		
		if (invService.checkInventory(ingredients)) {
			coffee.dispense();
			coffee.getCost();
			invService.deductFromInventory(ingredients);
			System.out.println("Your "+ coffee.getDrinkName() +" is ready. It costs $" + coffee.getCost() + "\n\n");
		} else {
			System.out.println("\n Out Of Stock : " + coffee.getDrinkName() + " \n Please Restock inventory and Re try \n\n");
		}	
		
		invService.displayInventoryStatus();	
	}

	

}

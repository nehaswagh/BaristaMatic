package com.barista.service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.barista.dto.Ingredient;

public class InventoryService {
	
	private static InventoryService inv;
	
	//Create Singleton Service Instance
	public static InventoryService getInstance() {
        if(inv == null) {
            inv = new InventoryService();
        }
        
        return inv;
    }

	private List<Ingredient> inventory = new ArrayList<Ingredient>();
	
	public InventoryService() {
		Ingredient coffee = new Ingredient (Ingredient.COFFEE, Ingredient.MAX_AVAILABLE_UNITS, 0.75);
	    Ingredient decafCoffee = new Ingredient (Ingredient.DECAF, Ingredient.MAX_AVAILABLE_UNITS, 0.75);
	    Ingredient sugar = new Ingredient (Ingredient.SUGAR, Ingredient.MAX_AVAILABLE_UNITS, 0.25);
	    Ingredient cream = new Ingredient (Ingredient.CREAM, Ingredient.MAX_AVAILABLE_UNITS, 0.25);
	    
	    Ingredient steamMilk = new Ingredient (Ingredient.STEAMED_MILK, Ingredient.MAX_AVAILABLE_UNITS, 0.35);
	    Ingredient foamMilk = new Ingredient (Ingredient.FOAMED_MILK, Ingredient.MAX_AVAILABLE_UNITS, 0.35);
	    Ingredient espresso = new Ingredient (Ingredient.ESPRESSO, Ingredient.MAX_AVAILABLE_UNITS, 0.25);
	    Ingredient cocoa = new Ingredient (Ingredient.COCOA, Ingredient.MAX_AVAILABLE_UNITS, 0.25);
	    
	    Ingredient whipCream = new Ingredient (Ingredient.WHIPPED_CREAM, Ingredient.MAX_AVAILABLE_UNITS, 0.25);
	    
	    inventory.add(coffee);
	    inventory.add(decafCoffee);
	    inventory.add(sugar);
	    inventory.add(cream);
	    inventory.add(steamMilk);
	    inventory.add(foamMilk);
	    inventory.add(espresso);
	    inventory.add(cocoa);
	    inventory.add(whipCream);
	    
	    inventory.sort(Comparator.comparing(Ingredient :: getName));
		
	}

//	public List<Ingredient> getInventory() {
//		return inventory;
//	}

//	public void setInventory(List<Ingredient> inventory) {
//		this.inventory = inventory;
//	}
	
	/**
	 *  Re-stock Inventory
	 */
	public void reStock() {
	    System.out.println("\nRestocking...");
        
        for (Ingredient inv: inventory) {
			inv.setAvailableUnits(Ingredient.MAX_AVAILABLE_UNITS);
		}

	    System.out.println("Restocking Completed.");
	}

	/**
	 *  Display Current Inventory Status
	 */
	public void displayInventoryStatus() {
			System.out.println("+++++++++++++++++ Inventory: ++++++++++++++++++++");
			for (Ingredient inv: inventory) {
				System.out.println(inv.getName() + " , " + inv.getAvailableUnits());
			}
	}
	
	/**
	 * @param ingredients
	 * @return
	 */
	public Boolean checkInventory(List<Ingredient> ingredients) {
		for (Ingredient ing: ingredients) {
			String ingName = ing.getName();
			for (Ingredient inv:inventory) {
				if(ingName.equalsIgnoreCase(inv.getName())) {
					if(ing.getAvailableUnits() > inv.getAvailableUnits()) {
						return false;
					}
				}
				
			}
			
		}
		return true;
	}
	
	/**
	 * @param ingredients
	 */
	public void deductFromInventory(List<Ingredient> ingredients) {
		for (Ingredient ing: ingredients) {
			String ingName = ing.getName();
			for (Ingredient inv:inventory) {
				if(ingName.equalsIgnoreCase(inv.getName())) {
					double availableUnits = inv.getAvailableUnits();
					inv.setAvailableUnits(availableUnits - ing.getAvailableUnits());
				}
				
			}
			
		}
	}

}

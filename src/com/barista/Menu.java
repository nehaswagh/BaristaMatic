package com.barista;
import java.util.ArrayList;
import java.util.List;

import com.barista.dto.CaffeAmericano;
import com.barista.dto.CaffeLatte;
import com.barista.dto.CaffeMocha;
import com.barista.dto.CaffieneCoffee;
import com.barista.dto.Cappuccino;
import com.barista.dto.Coffee;
import com.barista.dto.DecafCoffee;
import com.barista.service.InventoryService;

public class Menu {

	List<Coffee> menuList = new ArrayList<Coffee>();
	
	InventoryService invService = InventoryService.getInstance();
	
	public Menu() {
		
		menuList.add(new CaffeAmericano());
		menuList.add(new CaffeLatte());
		
		menuList.add(new CaffeMocha());
		menuList.add(new Cappuccino());

		menuList.add(new CaffieneCoffee());
		menuList.add(new DecafCoffee());
		
	}
	
	public void displayMenu() {
		
		int i = 0;
		StringBuffer displayMenu = new StringBuffer();
		for (Coffee coffee: menuList) {
			i++;
			displayMenu.append((String.valueOf(i) + ", "+ coffee.getDrinkName()) + ", $" 
			+ coffee.getCost() + ", "
					+ invService.checkInventory(coffee.getIngredients()).toString() +"\n");
		}
		System.out.println("\n++++++++++++++ Menu: +++++++++++++++++");
		System.out.println(displayMenu.toString());
	}
}

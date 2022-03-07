package com.barista;
import java.util.Scanner;

import com.barista.dto.CaffeAmericano;
import com.barista.dto.CaffeLatte;
import com.barista.dto.CaffeMocha;
import com.barista.dto.CaffieneCoffee;
import com.barista.dto.Cappuccino;
import com.barista.dto.DecafCoffee;
import com.barista.service.BaristaService;
import com.barista.service.InventoryService;

public class Barista{
	public static void main(String[] args) {
	    
		BaristaService barService = BaristaService.getInstance();
		InventoryService invService = InventoryService.getInstance();
		int coffeeCount = 0;
		Scanner scan = new Scanner(System.in);

		/**
		 * Welcome to BaristaMatic
		 * 
		 */

	    System.out.println(" ----------------------------------------------------------------");
	    System.out.println("|                 Welcome to BaristaMatic                        |");
	    System.out.println(" ----------------------------------------------------------------");

	    
	    //Display current Inventory Status
	    invService.displayInventoryStatus();
	    //Display Menu
	    Menu menu = new Menu();
	    menu.displayMenu();
	    
	    
	    boolean t = true;
	    
	    while(t){
	      
	        char c = scan.next().charAt(0);
	        switch(c){
	            case 'd', 'D':
	            	invService.displayInventoryStatus();
	            	menu.displayMenu();
	                break;
	            case 'r', 'R':
	            	System.out.println("------------- Restock Inventory: ------------");
	                invService.reStock();
	                // Show current inventory status
	                invService.displayInventoryStatus();
	                menu.displayMenu();
	                break;
	            case 'c', 'C':
	                System.out.println("\nWe Have Made "+coffeeCount+" Barista Drinks");
	                break;
	            case 'q', 'Q':
	                System.out.println("\nExiting...\n");
	                t = false;
	                break;
	            case '1':
	            	barService.makeCoffee(new CaffeAmericano());
	                coffeeCount++;
	                menu.displayMenu();
	                break;
	            case '2':
	            	barService.makeCoffee(new CaffeLatte());
	                coffeeCount++;
	                menu.displayMenu();
	                break;
	            case '3':
	            	barService.makeCoffee(new CaffeMocha());
	                coffeeCount++;
	                menu.displayMenu();
	                break;
	            case '4':
	            	barService.makeCoffee(new Cappuccino());
	                coffeeCount++;
	                menu.displayMenu();
	                break;
	            case '5':
	            	barService.makeCoffee(new CaffieneCoffee());
	                coffeeCount++;
	                menu.displayMenu();
	                break;
	            case '6':
	            	barService.makeCoffee(new DecafCoffee());
	                coffeeCount++;
	                menu.displayMenu();
	                break;
	            default:
	            	System.out.println("\nInvalid Selection: " + c +"\n");
	            	menu.displayMenu();
	            	
	        }   
	    }
	    
	    scan.close();
		
	    System.out.println("Shutting Down...\n");
	    
		}

}
package Assignment4;

import java.util.Scanner;

public class Waiter extends Employee {
	
	static Scanner userInput= new Scanner(System.in);
	


	//variables
	private  Dish [][] orderedDishes = new Dish[20][20];
	
	
	
	//getters and setters
	public Dish[][] getOrderedDishes() {
		return orderedDishes;
	}

	public void setOrderedDishes(Dish[][] orderedDishes) {
		this.orderedDishes = orderedDishes;
	}
	
	
	//methods
    public static void serveGuest(Guest g) {
    	System.out.println("Tina : Hello, how can I serve you?");
		
	}
	
    public static Dish[][] serveDish(MenuItem item, int orderID) {

    	  
    	
    		System.out.println("Here is your dish "  +   MenuItem.values()[orderID]);
    	
    		
    	
		return null;
	}
    
    public static void passMenu() {
    	for(MenuItem menuitem : MenuItem.values()) {
    		System.out.println(menuitem.getITEMID() +" "+menuitem+ " price : "+ menuitem.getPRICE()+ " EUR");
    	}
    	

		
	}
    
    public static void  makeOrder(Cook cook, MenuItem item, int orderID) { //John 
    	System.out.println("Tina : Dear John"  +  " make " + MenuItem.values()[orderID-1]);
	}

	
}






package CC4_Chathuri;

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
	public void serveGuest(Guest g) {
		System.out.println("Tina : Hello, how can I serve you?");

	}

	public Dish serveDish(MenuItem item, int customerID) {

		Dish servedDish = orderedDishes[item.ITEMID][customerID];

		System.out.println("Here is your dish "  +   item);

		return servedDish;
	}

	public void passMenu() {
		for(MenuItem menuitem : MenuItem.values()) {
			System.out.println(menuitem.getITEMID() +" "+menuitem+ " price : "+ menuitem.getPRICE()+ " EUR");
		}



	}

	public void  makeOrder(Cook cook, MenuItem item, int orderID) { //John
		System.out.println("Tina : Dear John"  +  " make " + MenuItem.values()[orderID-1]);
	}


}






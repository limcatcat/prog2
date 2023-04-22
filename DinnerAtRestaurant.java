package Assignment4;

public class DinnerAtRestaurant {

	public static void main(String[] args) {
		
		Resturant dinnerForOne = new Resturant("DinnerForOne", 3, true);
		Guest peter = new Guest("Peter", 1); 
		//Employee tina = new Waiter("s");
		Cook john = dinnerForOne.getCook();
	    Waiter tina = dinnerForOne.getWaiter();
		dinnerForOne.seatGuests(peter, 1);
		
		
		if(peter.isHungry()==true) {
			
			peter.callWaiter(tina);
			tina.serveGuest(peter);
			peter.askWaiter("Hello, can I have the menu, please?");
			tina.passMenu();
			peter.checkMenuAndOrder();
			//System.out.println(peter.getOrderID());
			tina.makeOrder(john, MenuItem.values()[peter.getOrderID()-1],peter.getCustomerID());
			peter.waitingForFood();
			Dish[][] servedDish;
			servedDish = tina.serveDish(MenuItem.values()[ peter.getCustomerID()-1],peter.getCustomerID());
			peter.eat(servedDish);
			System.out.println("... now pay the bill or wash the dishes");
			
			MenuItem myItem = MenuItem.values()[0];
			System.out.println(myItem);
			
		}	
		
		else {
			
			System.out.println(peter.getName()+ " is not hungry");
		
			
		
		}

	}

}

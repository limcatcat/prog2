package Assignment4;

import java.util.Scanner;

public class Guest {
	
	Scanner userInput= new Scanner(System.in);
	
	//private variables
	private String name;
	private int customerID;
	private String h = "true" ;
	private boolean hunger = Boolean.valueOf(h);
	private String w = "true" ;
	private boolean waiting = Boolean.valueOf(w);
	private String o = "true" ;
	private boolean ordered = Boolean.valueOf(o);
	private int orderID;
	private Waiter mywaiter;
	
	//static String status = "King";
		//public final Double MIN = 200.0.setReadOnly;
		//private double amountMoney;
		//protected String[][1.5] friends;
		//protected boolean inviteFriends = (amountMoney>MIN);
		
	
	//constructor
	Guest(){
		
	}
	
	
	public Guest(String name, int i) {
		this.name= name;
		this.customerID=i;
	}


	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Waiter getMywaiter() {
		return mywaiter;
	}
	public void setMywaiter(Waiter mywaiter) {
		this.mywaiter = mywaiter;
	}
	
	public boolean isHungry() {
		return hunger;
	}
	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}
	
	public boolean getOrdered() {
		return ordered;
	}
	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
	}
	
	
	public boolean getWaiting() {
		return waiting;
	}
	public void setWaiting(boolean waiting) {
		this.waiting = waiting;
	}
	
	
	//methods
	public void eat(Dish[][] servedDish) {
		
		String itemOrdered = MenuItem.values()[orderID-1].toString();
		for(int i=0;i<9;i++)
		System.out.println(Guest.this.getName()+" : Eating my "+itemOrdered + "\nDELICIOUS" );
		
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Once you're full, please press ENTER");
//		String inputdata = keyboard.nextLine();
//		int value = inputdata.length();
//		char c = ' ';
//		for(int i =0; i<value; i++)
//		{
//		 c = inputdata.charAt(i);
//		while(c=='\n') //'\n' is the ASCII key for Enter
//		{
//			System.out.println(Guest.this.getName()+" : Eating my "+servedDish + "\nDELICIOUS" );
//		}
//		}
		
	System.out.println("Once you're full, please press ENTER");
    String input = userInput.nextLine();
//	    
//	    
//	    if(userInput=='\n') 
//	    {
//	    break;
//	    }

        
		
		
	}
	public void order(int orderID) {
	
	}  
	public Waiter callWaiter(Waiter myWaiter) {
		System.out.println(Guest.this.getName()+" : Excuse me Waiter?");
		return myWaiter;
	
		
	}
	
	
	public void checkMenuAndOrder() {
		System.out.println(Guest.this.getName()+" : Looking at the menu");
		for(MenuItem menuitem : MenuItem.values()) {
    		System.out.println(menuitem.getITEMID() + " "+menuitem + " price : "+ menuitem.getPRICE()+ " EUR");
    	}
		
		System.out.println("Enter the ID for the Menu Item you would like to order :");
		orderID = userInput.nextInt();
		System.out.println(Guest.this.getName()+" : I would like to order "+ MenuItem.values()[orderID-1]);
		
		} 
		
	public int getOrder() {
		return this.orderID ;
	
		
	}	
	

	
	
	public String askWaiter(String question) {
		return question ;
	
		
	}
	
	public void waitingForFood() {
		for(int i=0;i<9;i++)
		System.out.println("Waiting...");
		System.out.println("Once the waiter arrives with your dish AND it looks good press ENTER :");
		
	
	    
	    String input = userInput.nextLine();
//	    Waiter.serveDish(MenuItem.values()[this.orderID], customerID);
	    this.waiting = false;
		
		
		
		
	
	}
	

	//getorder 
	
	
	
	
	
	
	

	

}

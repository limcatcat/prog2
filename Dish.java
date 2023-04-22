package CC4_Chathuri;

public class Dish implements Food{

	private Dish[][] orderedDishes = new Dish[20][20];

	public Dish(MenuItem name) {
		this.name = name;
	}

	//variables
	private MenuItem name;


	//getters and setters
	public void setName (MenuItem name) {
		this.name = name;


	}

	public MenuItem getName () {
		return this.name;


	}

	//methods
	public void cookDish (MenuItem name) {


	}

	public void isEaten () {



	}



}

package Assignment4;

public class Resturant {
	
	//private variables
	private int category;
	private String name;
	private boolean opened;
	private Cook john;
	private int stars;
	private Waiter tina;
	private Guest[]guests = new Guest[20];
	
	//constructor
	public Resturant(String name,  int stars, boolean opened) {
		this.name = name;
		this.stars = stars;
		this.opened = opened;
		
	}
	
	

	//getters and setters
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOpened() {
		return opened;
	}
	public void setOpened(boolean opened) {
		this.opened = opened;
	}
	public Cook getCook() {
		return john;
	}
	public void setCook(Cook john) {
		this.john = john;
	}
	public Waiter getWaiter() {
		return tina;
	}
	public void setWaiter(Waiter tina) {
		this.tina = tina;
	}
	public int getStars() {
		return stars;
	}


	public void setStars(int stars) {
		this.stars = stars;
	}

	public Guest[] getGuests() {
		return guests;
	}
	public void setGuests(Guest[] guests) {
		this.guests = guests;
	}
	
	public void seatGuests(Guest guest, int seatNumber) {
		
	}
	
	
	

}

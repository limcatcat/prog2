package Assignment4;

public enum MenuItem {
	TOMATOSOUP(1,5.5), SPAGHETTIBOLOGNESE(2,9.9), STEAK(3,19.9), SCHNITZEL(4,14.5), FRUITSALAD(5,5.2), CHOCOLATCREAM(6,4.9);
	
	//variables
	protected double PRICE;
	protected int ITEMID;
	
	//constructors
	 private MenuItem () {
		
   }
   
   private MenuItem (int itemID, double price) {
		this.ITEMID = itemID;
		this.PRICE = price;
		
	}

	
	
	//getters and setters
	public double getPRICE() {
		return PRICE;
	}

	public void setPRICE(double price) {
		this.PRICE = price;
	}

	public int getITEMID() {
		return ITEMID;
	}

	public void setITEMID(int iTEMID) {
		this.ITEMID = iTEMID;
	}
	
	
	

}

 
 

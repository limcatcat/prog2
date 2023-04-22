package Assignment4;

public abstract class Employee {
	
	//variables
	protected String name;
	protected int persID;
	protected double salary;
	
	//public Employee(String name) {
	//	this.name = name;
	//  }
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPersID() {
		return persID;
	}
	public void setPersID(int persID) {
		this.persID = persID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}

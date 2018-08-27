//Caroline Kops
//Quiz 8, 8/27/18
public abstract class Product {
//declare variables
	protected String name;
	protected double price;
	protected int quantity;
	
//setters and getters
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
//constructor
protected Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

//abstract method
abstract void getDetails();

//instance method
protected boolean Buy() {
	if(this.quantity > 0) {
		--this.quantity;
		return true;
	}
	else {
		return false;
	}
}
}

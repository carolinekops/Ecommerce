//Caroline Kops 
//quiz 5
//August 13th, 2018
public class Product {
//declare variables
	private String name;
	private double price;
	private String category;
	private int quantity;
	private char size;
	private String author;
	private String color;

//Setters & getters
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
//Apparel Constructor
Product(String name, double price, String category, int quantity, char size, String color){
	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
	this.size = size;
	this.color = color;
}
//book constructor
Product(String name, double price, String category, int quantity, String author){
	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
	this.author = author;
}
//soap constructor
Product(String name, double price, String category, int quantity){
	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
}
//toString method

public String toString() {
	return "Product [name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity
			+ ", size=" + size + ", author=" + author + ", color=" + color + "]";
}
boolean Buy() {
	if(this.quantity > 0) {
		--this.quantity;
		return true;
	}
	else {
		return false;
	}
}
}


public class Apparel extends Product{
	private char size;
	private String color;
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}
	//overriding getDetails
	@Override
	void getDetails() {
		System.out.println("We sell differentk kinds of business clothes for both men and women");
	}
	//toString
	@Override
	public String toString() {
		return "Apparel [size=" + size + ", color=" + color + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}

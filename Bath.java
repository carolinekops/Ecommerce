
public class Bath extends Product{
	
	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	@Override
	void getDetails() {
		System.out.println("We sell organic bath products!");
		
	}

	@Override
	public String toString() {
		return "Bath [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}

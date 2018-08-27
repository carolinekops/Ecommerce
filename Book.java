
public class Book extends Product {
	private String author;
	private String genre;
	private String isbn;
	//Constructor with all parameters
	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}
	//Constructor with some parameters
	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
	}
	//overriding getDetails
	@Override
	void getDetails() {
		System.out.println("We sell books that'll make you smarter at programming");
	}
	//toString
	@Override
	public String toString() {
		return "Book [author=" + author + ", genre=" + genre + ", isbn=" + isbn + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
}

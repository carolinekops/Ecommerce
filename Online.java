import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Online {
//static class variables
	static ArrayList<Product> items = new ArrayList<Product>();
	static double totalAmount = 0.0;
	static int userInput = 9;
	
public static void main(String[] args) {
//add objects to array list
	Scanner keyboard = new Scanner(System.in);
	items.add(new Apparel("Business Ritual Women's Long Sleeve Top", 65.39, 4, 'L', "Blue") );
	items.add(new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth", "Education", "9788-429-1266-48"));
	items.add(new Apparel ("Men's Business Casual Shirt", 57.10, 2, 'M', "Teal"));
	items.add(new Bath("Organic Tumeric Soap", 11.25, 1));
	items.add(new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman"));

	while(true) {
		System.out.println("Enter the product index (0 to 4) you want to buy. To exit shopping cart, enter any number other than 0 to 4.");
	for(int i = 0; i < items.size(); i ++) {
		System.out.println(i + " : " + items.get(i).getName());
		//System.out.println(i + " : " + items.get(i));
		}
		
	try {
		userInput = keyboard.nextInt();
		if(items.get(userInput).Buy()) {
				System.out.println("Your purchase was successful");
				totalAmount += items.get(userInput).getPrice();
			}
		else {
			System.out.println("Sorry! This product is out of stock");
			}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Invalid input, exiting the shopping cart!");
			break;
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input, exiting the shopping cart!");
			break;
		}
		finally{
			System.out.println("Thanks for shopping, your current total is " + totalAmount + ".");
		
		}
	}
	keyboard.close();
}}

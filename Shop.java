import java.util.Scanner;
import java.util.*;
public class Shop {

	public static void main(String[] args) {
		//Declare local variables
		Scanner keyboard = new Scanner(System.in);
		Product[] inventory = new Product[5];
		double totalAmount = 0.0;
		int userInput = 9;
		
		//declare and assign objects
		inventory[0] = new Product("Business Ritual Women’s Long Sleeve Top" ,65.39, "Apparel",4, 'L', "Blue");
		inventory[1] = new Product("The Art of Computer Programming", 190.54,"Books", 9, "Donald E. Knuth");
		inventory[2] = new Product("Men's Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal");
		inventory[3] = new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty",1);
		inventory[4] = new Product("Head First Design Pattern", 37.35, "Books",3, "Eric Freeman");
		
		//For extra credit: Prints the Name of each item in inventory
		/* for(Product x: inventory) {
			System.out.println(x.getName());	
		} */
		
		//while(true) loop
		while(true) {
			System.out.println("Enter the product index (0 to 4) you want to buy. To exit shopping cart, enter any number other than 0 to 4.");
			for(int i=0; i<inventory.length; i++) {
				System.out.println(i +" : " + inventory[i].getName());
			}
			try {
				userInput = keyboard.nextInt();
			}
			//Will catch is user inputs something other than integer
			catch(InputMismatchException e){
				System.out.println("Invalid input, exiting the shopping cart! Your total is " + totalAmount);
				break;
			}
		//checks if user put in a correct index number, then checks if there is any in stock
		if(userInput >= 0 && userInput <= 4) {
			if(inventory[userInput].Buy() == true) {
				System.out.println("Successful");
				totalAmount += inventory[userInput].getPrice();
			}
			else {
				System.out.println("Sorry! This product is out of Stock");
			}
		}
		else {
			System.out.println("Thank you for shopping with us! The total amount is  " + totalAmount);
			break;
		}
}
keyboard.close();
}	
}

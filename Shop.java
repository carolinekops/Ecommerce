import java.util.Scanner;
import java.util.*;
public class Shop {

	static double totalAmount = 0.0;
	static int userInput = 9;
	static Product[] inventory = {new Product("Business Ritual Women’s Long Sleeve Top" ,65.39, "Apparel",4, 'L', "Blue"), new Product("The Art of Computer Programming", 190.54,"Books", 9, "Donald E. Knuth")
			,new Product("Men's Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal"),new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty",1), new Product("Head First Design Pattern", 37.35, "Books",3, "Eric Freeman")};
	static boolean isShopOpen = true;
	
public static void main(String[] args) {
		//Declare local variables
		Scanner keyboard = new Scanner(System.in);

	if(isShopOpen = false) {	
		System.out.println("Shop is closed, try again later!");
		
	}else {
		while(true) {
			System.out.println("Enter the product index (0 to 4) you want to buy. To exit shopping cart, enter any number other than 0 to 4.");
			for(int i=0; i<inventory.length; i++) {
				System.out.println(i +" : " + inventory[i].getName());
			}
			try {
				userInput = keyboard.nextInt();
				if(inventory[userInput].Buy() == true) {
					System.out.println("Your purchase was successful");
					totalAmount += inventory[userInput].getPrice();
				}
			else {
				System.out.println("Sorry! This product is out of stock");
				}
			}
			
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Invalid input, exiting the shopping cart! Total amount is " + totalAmount);
				break;
			}	
		}		
	}
	keyboard.close();
	}

}
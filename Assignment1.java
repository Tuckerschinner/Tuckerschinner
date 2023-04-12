/** Author: Thomas Schinner
* Date: March 24, 2023 
* This Program ask a user for id, product price, quanity of items, item description, and a discount
* then returns the id, product price, quanity of items, item description, a discount, prints price before discount, 
* and after discount
*/
import java.util.Scanner;
public class Assignment1 {
	
	public static void main(String[] args) {
		//Variables for ID, product price, quanity of items, item description, and a discount
		String custId;
		double unitPrice;
		int quanity;
		String productDis;
		double discount;
		
		//Input variables for ID, product price, quanity of items, item description, and a discount
		Scanner idInput = new Scanner(System.in);
		Scanner priceInput = new Scanner(System.in);
		Scanner quanityInput = new Scanner(System.in);
		Scanner discriptInput = new Scanner(System.in);
		Scanner discountInput = new Scanner(System.in);
		
		//Ask for input and saves to variable
		System.out.print("Please enter your customer ID: ");
		custId = idInput.nextLine();
		System.out.print("Please enter unit price in currency format (e.g. 3.25): $");
		unitPrice = priceInput.nextDouble();
		System.out.print("Please enter quantity of products: ");
		quanity = quanityInput.nextInt();
		System.out.print("Please enter product description: ");
		productDis = discriptInput.nextLine();
		System.out.print("Please enter discount in decimal format (e.g. .15): ");
		discount = discountInput.nextDouble();
		System.out.print("\n");
		
		//Gives a description of the user inputs and prints the input
		System.out.println("ORDER DATA");
		System.out.println("Customer id: " + custId);
		System.out.printf("Unit Price: $%.2f", unitPrice);
		System.out.println("\nQuantity: " + quanity);
		System.out.println("Product description: " + productDis);
		System.out.println("Discount: " + discount);
		
		//totalBefore totals the price * the unit
		double totalBefore = unitPrice * quanity;
		//totalAfter takes the discount off of total before
		double totalAfter = (totalBefore *1) - (totalBefore * discount);
		
		//A total price and a total price with discount added
		System.out.printf("\nTotal BEFORE discount: $%.2f", totalBefore);
		System.out.printf("\nTotal AFTER discount: $%.2f", totalAfter);
		
		//Closing of Scanners
		idInput.close();
		priceInput.close();
		quanityInput.close();
		discriptInput.close();
		discountInput.close();
	}

}

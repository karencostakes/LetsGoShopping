
package letsGoShopping;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice;
		Path filePath = Paths.get("productMenu.txt");

		File myConfigFile = filePath.toFile();
		ProductMenuTextFile pmt = new ProductMenuTextFile();
		pmt.writeToFile(myConfigFile);

		System.out.println("Welcome to the Ultimate Java Collection!");
		System.out.println(
				"Would you like to take a look at our vast selection aimed to assist any DevelopHers feeling a bit imposteryish? (Please enter 'heck yes')");
		choice = scan1.nextLine();

		ArrayList<Product> itemList = new ArrayList();
		ArrayList<Product> itemPurchasedList = new ArrayList();
		Product p = null;
		itemList.add(new Product("a", "Antonella", 1000000, 10));
		itemList.add(new Product("b", "Kamel Super Constructor", 500000, 10));

		// itemList.add (new Product ("c","", ));
		// itemList.add (new Product ("d", "", ));
		// itemList.add (new Product ("e", "", ));
		// itemList.add (new Product ("f", "",));
		// itemList.add (new Product ("g", ));
		// itemList.add (new Product ("h", ));
		// itemList.add (new Product ("i", ));
		// itemList.add (new Product ("j", ));


		while (choice.equalsIgnoreCase("heck yes")) {

			pmt.readFile(myConfigFile);

			System.out.println(
					"Please enter the product you want to purchase (enter the letter that corresponds to the product you are interested in:)");
			String userSelection = scan1.nextLine();
			int input = 0;
			String item = "";

			for (int i = 0; i < itemList.size(); i++) {
				if (userSelection.equalsIgnoreCase(itemList.get(i).getItemAlpha())) {
					p = itemList.get(i);
					item = p.getItem();
					itemPurchasedList.add(p);

				}
			}
			System.out.println("How many " + item + " would you like?");
			input = scan1.nextInt();
			scan1.nextLine();
			p.setUserQuantity(input);
			p.getLineTotal();
			System.out.println(
					"Would you like to continue shopping or checkout? (please enter 'heck yes' or 'checkout')");
			choice = scan1.nextLine();

			if ((choice.equalsIgnoreCase("heck yes")) || (choice.equalsIgnoreCase("yes"))) {
				continue;
			} else {
				System.out.println("Here is the total for your order: ");

			}

		}

		double subTotal = getSubTotal(itemPurchasedList);

		System.out.println("Subtotal: " + subTotal);

		double salesTaxRate = .06;
		double salesTaxAmount = salesTaxRate * subTotal;
		double grandTotal = subTotal + salesTaxAmount;
		System.out.println("Tax: " + salesTaxAmount);
		System.out.println("Your Grand Total: " + grandTotal);
		
		System.out.println("How would you like to pay? (Cash/check/credit card):");
		String paymentInfo = scan1.nextLine();
		if (paymentInfo.equalsIgnoreCase("cash")){
			System.out.println("Please enter the amount you are paying : ");
			double payment=scan1.nextDouble();
			              scan1.nextLine();
			   if (payment>grandTotal){
				   double change = payment-grandTotal;
				   System.out.println("Thanks for your purchase here is your change: "+ change);
			   }
			   else if(payment<grandTotal){
				   double stillOwe= grandTotal-payment;
				   System.out.println("Nice try, buddy!! you still owe: "+ stillOwe);
			   }
			   else{
				   System.out.println("Thank you for shopping. Please tell your java friends about us.");
			   }
		}
		if(paymentInfo.equalsIgnoreCase("check")){
			System.out.println("Please write a check for the amount of : "+ grandTotal + " Please enter your check number :");
			long checkNumber =scan1.nextLong();
			               scan1.nextLine();
			System.out.println("Thank you for shopping. Please tell your java friends about us.");
		}
		if(paymentInfo.equalsIgnoreCase("credit card")){
			System.out.print("Please enter your credit card number: ");
			String ccNumber = scan1.nextLine();
			System.out.print("Please enter your expiration date :(MM/YY)");
			String expDate = scan1.nextLine();
			System.out.print("Please enter the CVV:");
			short cvvNumber = scan1.nextShort();
			scan1.nextLine();
			System.out.println("Thank you for shopping. Please tell your java friends about us.");
		}                   

	}

	public static double getSubTotal(ArrayList<Product> itemPurchasedList) {
		double sum = 0;
		for (int i = 0; i < itemPurchasedList.size(); i++) {
			Product q = itemPurchasedList.get(i);
			sum = sum + q.getLineTotal();

		}

		return sum;

	}
	

}

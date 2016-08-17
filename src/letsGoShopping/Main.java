
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
		int input = 0;
		String item = "";
		Path filePath = Paths.get("productMenu.txt");

		File myConfigFile = filePath.toFile();
		ProductMenuTextFile pmt = new ProductMenuTextFile();
		pmt.writeToFile(myConfigFile);
		String openToBusiness="yes";
		while(openToBusiness.equalsIgnoreCase("yes")){

		System.out.println("WELCOME TO THE ULTIMATE JAVA COLLECTION!!");
		System.out.println();
		System.out.print(
				"Would you like to take a look at our vast 'array' of products aimed to assist any DEVELOP(her)s feeling a bit imposterish-y?! ('heck yes' or 'yes')");
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

		while (choice.equalsIgnoreCase("heck yes") || (choice.equalsIgnoreCase("yes"))) {

			pmt.readFile(myConfigFile);

			System.out.print(
					"Please enter the letter of the product you want to purchase: ");
			String userSelection = scan1.nextLine();

			for (int i = 0; i < itemList.size(); i++) {
				if (userSelection.equalsIgnoreCase(itemList.get(i).getItemAlpha())) {
					p = itemList.get(i);
					item = p.getItem();
					itemPurchasedList.add(p);

				}
			}
			System.out.print("How many " + item + " would you like?  ");
			input = scan1.nextInt();
			scan1.nextLine();
			p.setUserQuantity(input);
			double lineTotal=p.getLineTotal();
      
			System.out.println();
			System.out.println("Here are the items in your Shopping Cart: \t"+ input+"\t"+ item+"\t"+"Subtotal: "+ lineTotal);
	System.out.println();		
      System.out.print(
					"Would you like to continue shopping or checkout? ('heck yes' or 'checkout')");
			choice = scan1.nextLine();

			if ((choice.equalsIgnoreCase("heck yes")) || (choice.equalsIgnoreCase("yes"))) {
				continue;
			} else {
				System.out.println();
				System.out.println("Here is the total for your order: ");

			}

		}

		double subTotal = getSubTotal(itemPurchasedList);

		System.out.println("Subtotal: \t"+"\t" + subTotal);

		double salesTaxRate = .06;
		double salesTaxAmount = salesTaxRate * subTotal;
		double grandTotal = subTotal + salesTaxAmount;
		System.out.println("Tax: \t" +"\t"+"\t"+ "  "+ salesTaxAmount);
		System.out.println("Your Grand Total: \t" + grandTotal);

		System.out.println();
		System.out.print("How would you like to pay? (Cash/check/credit card): ");
		String paymentInfo = scan1.nextLine();
		if (paymentInfo.equalsIgnoreCase("cash")) {
			System.out.print("Please enter the amount you are paying: $");
			System.out.println();
			double payment = scan1.nextDouble();
			scan1.nextLine();
			if (payment > grandTotal) {
				double change = payment - grandTotal;
				System.out.print("Thanks for your purchase! Here is your change: $" + change);
			System.out.println();
			} else if (payment < grandTotal) {
				double stillOwe = grandTotal - payment;
				System.out.print("Nice try, buddy!! You still owe: " + stillOwe);
				System.out.println();
			} else {
				System.out.println();
				System.out.println("Thank you for shopping with us! Please tell your Java friends about us!");
			}
		}
		if (paymentInfo.equalsIgnoreCase("check")) {
			System.out.print(
					"Please write a check for the amount of: $" + grandTotal +"."+ " Please enter your check number here: ");
			long checkNumber = scan1.nextLong();
			scan1.nextLine();
			System.out.println();
			System.out.println("Thank you for shopping. Please tell your java friends about us.");
		}
		if (paymentInfo.equalsIgnoreCase("credit card")) {
			System.out.print("Please enter your credit card number: ");
			String ccNumber = scan1.nextLine();
			System.out.print("Please enter your expiration date :(MM/YY)");
			String expDate = scan1.nextLine();
			System.out.print("Please enter the CVV:");
			short cvvNumber = scan1.nextShort();
			scan1.nextLine();
			System.out.println();
			System.out.println("Thank you for shopping with us! Please tell your Java friends about us!");
		}
		System.out.println();
		System.out.println("Here is your receipt...");
		Receipt r = new Receipt(input, item, subTotal, grandTotal, paymentInfo);
		r.printReceipt();
		System.out.println();
		System.out.println();
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

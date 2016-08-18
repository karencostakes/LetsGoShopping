
package letsGoShopping;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
		String openToBusiness = "yes";
		while (openToBusiness.equalsIgnoreCase("yes")) {

			System.out.println("WELCOME TO THE ULTIMATE JAVA COLLECTION!!");
			System.out.println();
			System.out.print(
					"Would you like to take a look at our vast 'array' of products aimed to assist any DEVELOP(her)s feeling a bit imposterish-y?! ('heck yes' or 'yes')");
			choice = scan1.nextLine();

			ArrayList<Product> itemList = new ArrayList();
			ArrayList<Product> itemPurchasedList = new ArrayList();
			Product p = null;
			itemList.add(new Product("A", "DeeAnn Determination", 50, 1000));
			itemList.add(new Product("B", "Bottle of Blair", 50, 1000));
			itemList.add(new Product("C", "Grace Goblet", 50, 1000));
			itemList.add(new Product("D", "Eau de Murach Memory", 50, 1000));
			itemList.add(new Product("E", "Laughter de Lily", 50, 1000));
			itemList.add(new Product("F", "La Latresha", 50, 1000));
			itemList.add(new Product("G", "L'aurin", 50, 1000));
			itemList.add(new Product("H", "Miss Ambyr", 50, 1000));
			itemList.add(new Product("I", "Valerium", 50, 1000));
			itemList.add(new Product("J", "Jannaspirin", 50, 1000));
			itemList.add(new Product("K", "Amerall", 50, 1000));
			itemList.add(new Product("L", "Abivan", 50, 1000));
			itemList.add(new Product("M", "Tommy Tablets", 50, 1000));
			itemList.add(new Product("N", "Kamel Constructor Cape", 50, 1000));
			itemList.add(new Product("O", "Gerrae Glasses", 50, 1000));
			itemList.add(new Product("P", "Shruti Shoes", 50, 1000));
			itemList.add(new Product("Q", "Jamila Jacket", 50, 1000));
			itemList.add(new Product("R", "Kristen Cap", 50, 1000));
			itemList.add(new Product("S", "Vonnita Vest", 50, 1000));
			itemList.add(new Product("T", "Pocket Antonella", 50, 1000));
			itemList.add(new Product("U", "Tracy Tophat ", 50, 1000));

			while (choice.equalsIgnoreCase("heck yes") || (choice.equalsIgnoreCase("yes"))) {

				pmt.readFile(myConfigFile);

				System.out.print("Please enter the letter of the product you want to purchase: ");
				String userSelection = "";
				//still working on try/catch
				try {
					userSelection = scan1.nextLine();
				} catch (InputMismatchException e) {
					System.out.println("Please enter a letter only.");
				}
				for (int i = 0; i < itemList.size(); i++) {
					if (userSelection.equalsIgnoreCase(itemList.get(i).getItemAlpha())) {
						p = itemList.get(i);
						item = p.getItem();
						itemPurchasedList.add(p);

					}
				}
				System.out.print("How many " + item + "s" + " would you like?  ");
				input = scan1.nextInt();
				scan1.nextLine();
				p.setUserQuantity(input);
				System.out.println("Here are the items in your Shopping Cart: ");
				for (int i = 0; i < itemPurchasedList.size(); i++) {
					Product x = itemPurchasedList.get(i);
					System.out.println(input + "\t" + x.getItem() + "\t" + "$" + x.getLineTotal());
				}

				System.out.println();
				System.out.print("Would you like to continue shopping or checkout? ('heck yes' or 'checkout')");
				choice = scan1.nextLine();

				if ((choice.equalsIgnoreCase("heck yes")) || (choice.equalsIgnoreCase("yes"))) {
					continue;
				} else {
					System.out.println();
					System.out.println("Here is the total for your order: ");

				}

			}

			double subTotal = getSubTotal(itemPurchasedList);

			System.out.println("Subtotal: \t" + "\t" + "$" + subTotal);

			double salesTaxRate = .06;
			double salesTaxAmount = salesTaxRate * subTotal;
			double grandTotal = subTotal + salesTaxAmount;
			System.out.println("Tax: \t" + "\t" + "\t" + "$" + " " + salesTaxAmount);
			System.out.println("Your Grand Total: \t" + "$" + grandTotal);

			System.out.println();
			System.out.print("How would you like to pay? (Cash/check/credit card): ");
			String paymentInfo = scan1.nextLine();
			boolean isTrue = false;
			while (isTrue == false) {
				if (paymentInfo.equalsIgnoreCase("cash")) {
					System.out.print("Please enter the amount you are paying: $");
					double payment = scan1.nextDouble();
					scan1.nextLine();
					if (payment > grandTotal) {
						double change = payment - grandTotal;
						System.out.println();
						System.out.print("Thanks for your purchase! Here is your change: $" + change);
						System.out.println();
						isTrue = true;
					} else if (payment < grandTotal) {
						double stillOwe = grandTotal - payment;
						System.out.print("Nice try, buddy!! You still owe: " + stillOwe);
						System.out.println();
						isTrue = false;
						continue;
					} else {
						System.out.println();
						System.out.println("Thank you for shopping with us! Please tell your Java friends about us!");
						isTrue = true;
					}
				}
				if (paymentInfo.equalsIgnoreCase("check")) {
					System.out.print("Please write a check for the amount of: $" + grandTotal + "."
							+ " Please enter your check number here: ");
					long checkNumber = scan1.nextLong();
					scan1.nextLine();
					System.out.println();
					System.out.println("Thank you for shopping. Please tell your java friends about us.");
				}
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
			System.out.println("Qty\t" + "Item\t");
			for (int i = 0; i < itemPurchasedList.size(); i++) {
				Product y = itemPurchasedList.get(i);
				Receipt r = new Receipt(input, y.getItem(), y.getLineTotal());
				r.printReceipt();
			}
			System.out.println("-----------------------------");
			System.out.println("SubTotal: $" + subTotal);
			System.out.println("GrandTotal: $" + grandTotal);
			System.out.println("Payment Method:" + paymentInfo);
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

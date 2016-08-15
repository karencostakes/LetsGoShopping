
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
		 // ArrayList <Product> itemList = new ArrayList ();
		//  itemList.add(new Product ("a", "Antonella", 10,00,000));
		// itemList.add (new Product ("b", "", ""));
		// itemList.add (new Product ("c","", ""));
		// itemList.add (new Product ("d", "", ""));
		// itemList.add (new Product ("e", "", ""));
		// itemList.add (new Product ("f", "", ""));
		// itemList.add (new Product ("g", ""));
		// itemList.add (new Product ("h", ""));
		// itemList.add (new Product ("i", ""));
		// itemList.add (new Product ("j", ""));

		while (choice.equalsIgnoreCase("heck yes")) {

			pmt.readFile(myConfigFile);

		
	

			System.out.println(
					"Please enter the product you want to purchase (enter the letter that corresponds to the product you are interested in:)");
			String userSelection = scan1.nextLine();
			
			

			choice = "heck no";
			// System.out.println("Continue?");
			// choice = scan1.nextLine();

		}

	}
}

package letsGoShopping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProductMenuTextFile {
	
	
	public static void readFile(File myConfigFile) {
		try {
			FileReader reader = new FileReader(myConfigFile);
			BufferedReader bReader = new BufferedReader(reader);
			String newLine = bReader.readLine();
			// We can use these lines for many things (like reading from a
			// database)
			while (newLine != null) {
				System.out.println(newLine);
				newLine = bReader.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	


	public static void writeToFile(File myConfigFile) {
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(myConfigFile);
			writer.print("Pocket Antonella\t");
			writer.print("1,000,000\t");
			writer.print("Take Antonella with you to help with all of your Java questions\t");
			writer.print("Java Help");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			writer.close();
		}
	}


/*	public static void writeToFileAppend(File myConfigFile) {
		FileWriter writer = null;
		
		//String userSelection = null;
		try {
			Scanner scan1 = new Scanner (System.in);
			String userCountry;
			System.out.println("What country would you like to add?");
			userCountry = scan1.nextLine();
			writer = new FileWriter(myConfigFile,  true);
			
			writer.append(userCountry);
			writer.close();
			// writer.println(" ");
			// writer.println("I said Hello World!");
			// writer.append("hello\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		} finally {
			// writer.close();
		}*/
	

}



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
	
	// testing push this file from eclipse
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
			writer.println("Category: Elixirs and Potions");
			writer.println("A." + "\t" + "DeeAnn Determination" + "\t" + "One drop of will give you the oomph you need to tackle any lab or code challenge" + "\t" + "$50");
			writer.println("B." + "\t"  +  "Bottle of Blair"  + "\t" +  "\t" + "Drink one bottle to increase your wit and style" +  "\t" + "\t"  + "$50");
			writer.println("C." + "\t" + "Grace Goblet" + "\t" +  "Drink from your goblet when you are feeling frazzled and want to feel calm" + "\t" + "$50");
			writer.println ();
			writer.println("Category: Perfumes");
			writer.println("D." + "\t" + "Eau de Murach Memory" + "\t" +  "A spritz will help you retain everything you read from Murach after only 1 reading" + "\t" + "$50");
			writer.println("E."  + "\t" +  "Laughter de Lily" + "\t" +  "Spray to hear the laughter of an angel to brighten your mood" + "\t" +  "$50");
			writer.println("F." + "\t" +  "La Latresha" + "\t" +   "A drop of this perfume will turn you into a super lady ready to tackle it all" + "\t" + "$50");
			writer.println("G."  + "\t" + "L'aurin" + "\t" + "\t" +  "Feeling crabby and need a positive attitude? Spritz L'aurin to morph into your lovely self" + "\t" + "$50");
			writer.println("H." + "\t" +  "Miss Ambyr" + "\t" + "Interview jitters?  A bit of this perfume will help you transition into a charming candidate" + "\t" + "$50");
			writer.println ();
			writer.println("Category: Pills");
			writer.println("I." + "\t" +  "Valerium" + "\t" +  "Frantic and harried while attempting a lab?  Pop a Valerium to calm your nerves" + "\t" +  "$50");
			writer.println("J." + "\t" + "Jannaspirin" + "\t" + "Murach's got you down?  Take 2 Jannaspirin to feel poised and peaceful" + "\t" + "$50");
			writer.println("K."  + "\t" +  "Amerall" + "\t" + "\t" +  "Feeling unfocused?  Use Amerall to focus your energy and write spectacular to do lists" + "\t" + "$50");
			writer.println("L." + "\t" +  "Abivan" + "\t" + "\t" +  "Dreaming of Method Monsters and Git Goblins?  Take an Abivan to eliminate your Janxiety" + "\t" +  "$50");
			writer.println("M." + "\t" +  "Tomeka Tablets" + "\t" + "\t" + "Want to be funny?  Take 2 Tomeka Tablets and get ready for hilarity to ensue" + "\t" + "$50");
			writer.println ();
			writer.println("Category: Accessories");
			writer.println("N." + "\t" + "Kamel Constructor Cape" + "\t" +  "Wear your dashing cape to program the perfect constructors for your program" + "\t" +  "$50");
			writer.println("O." + "\t" +  "Gerrae Glasses" + "\t" + "Wear your glamorous frames to see Java with new insights" + "\t" + "$50");
			writer.println("P." + "\t" +   "Shruti Shoes" + "\t" + "Lace up and sprint type your way to dazzling code" + "\t" + "$50");
			writer.println("Q." + "\t" +   "Jamila Jacket" + "\t" + "Cat got your tongue?  Wear your Jamila Jacket to confidently communicate your message" + "\t" + "$50");
			writer.println("R." + "\t" +   "Kristen Cap" + "\t" + "Wear this cap and you will morph into an open minded, feedback receiving machine" + "\t" +  "$50");
			writer.println("S." + "\t" +   "Vonnita Vest" + "\t" + "Wear your vest to win over potential employers with sweetness and charm" + "\t" + "$50");
			writer.println("T." + "\t" +  "Pocket Antonella" + "\t" + "Must have accessory.  Take Antonella with you anywhere you go" + "\t" + "$50");
			writer.println("U." + "\t" + "Tracy Tophat" + "\t" + "Put on your snazzy topcoat if your teamwork need some light and laughter" + "\t" + "$50");
			
			

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



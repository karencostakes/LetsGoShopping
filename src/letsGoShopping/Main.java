package letsGoShopping;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		

		Path filePath = Paths.get("productMenu.txt");
		
		File myConfigFile = filePath.toFile();
		
		ProductMenuTextFile pmt = new ProductMenuTextFile ();
		pmt.writeToFile(myConfigFile);
		pmt.readFile(myConfigFile);
	}

}

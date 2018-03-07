package week3.day3.appcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * Java program to read file using Scanner class in Java. java.util.Scanner is
 * added on Java 5 and offer convenient method to read data
 *
 * @author
 */
public class ScannerExample {

	public static void main(String args[]) throws IOException {
		Scanner scnr = null;
		// creating File instance to reference text file in Java
		File text = new File("src/main/resources/xanadu.txt");
		try {
			// Creating Scanner instance to read File in Java
			scnr = new Scanner(new BufferedReader(new FileReader(text)));
			scnr.useDelimiter("\n");
			// Reading each line of file using Scanner class
			int lineNumber = 1;

			while (scnr.hasNext()) {
				String line = scnr.next(); 
				System.out.print("line " + lineNumber + " :" + line);
				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (scnr != null) {
				scnr.close();
			}
		}
	}

}

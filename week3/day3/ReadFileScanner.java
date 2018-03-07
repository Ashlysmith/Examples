package week3.day3.appcode;

import java.io.*;
import java.util.Scanner;

public class ReadFileScanner {
	public static void main(String[] args) {

		String fileName = "src/main/resources/xanadu.txt";
		Scanner s = null;
		// Scanner s1 = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader(fileName)));
			s.useDelimiter("\n");
			// s1 = new Scanner(System.in);
			while (s.hasNext()) {
				System.out.print(s.next());
			}
		} catch (FileNotFoundException fnf) {
			System.err.format("File: %s not found%n", fileName);
			fnf.printStackTrace();
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}

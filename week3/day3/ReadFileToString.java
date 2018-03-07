package week3.day3.appcode;

import java.io.*;

public class ReadFileToString {

	public static String readFileToString(String inputFile) {

		String fileOut = "";
		File aFile = new File(inputFile);
		try (FileInputStream file = new FileInputStream(aFile)) {

			int size = (int) aFile.length();

			byte[] byteFile = new byte[size];
			file.read(byteFile);
			fileOut = new String(byteFile);

			file.close();
		} catch (FileNotFoundException fnf) {
			System.err.format("File: %s not found%n", inputFile);
			fnf.printStackTrace();
		} catch (IOException ioe) {
			System.out.println("Error -- " + ioe.toString());
			ioe.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ioe) {
			// catch block
			System.out.println("Array out of Bounds -- " + ioe.toString());
			ioe.printStackTrace();
		}

		return fileOut;
	}

	public static void main(String[] args) throws IOException {
		
		String inputFileFile = "src/main/resources/xanadu.txt";
		System.out.println(readFileToString(inputFileFile));

		
	}
}

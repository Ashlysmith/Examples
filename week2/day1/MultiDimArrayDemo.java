package week3.day1.appcode;

public class MultiDimArrayDemo {

	public static void main(String[] args) {
	
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printTwoDimensionaArray(matrix);
		multiDimArrayDemo();

	}

	public static void printTwoDimensionaArray(int[][] matrix) {

		printMatrix(matrix);

	}

	public static void printMatrix(int[][] matrix) {

		System.out.println("Original Array");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println(" The Transpose Matrix ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[j][i] + "\t");
			}
			System.out.println();
		}

	}

	public static void multiDimArrayDemo() {

		// Change the Multi-dimensional Array Code to print the following:
		// “Mrs. Smith”
		// “Mr.Jones”
		// String[] name = { "Mr ", "Smith" };
		String[][] names = {
				// 1st row
				{ "Mr", "Mrs", "Ms" },
				// 2nd row
				{ "Smith", "Jones" }

		};
		// This will output Mr.Smith..
		System.out.println(names[0][1] + ". " + names[1][0]);

		System.out.println(names[0][0] + "." + names[1][1]);

	}

}

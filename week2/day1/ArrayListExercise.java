package week3.day1.appcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * Write a Method called addElements() that takes in input as a String Array and
 * adds the elements to arrayList of Strings and returns the ArrayList<String>
 * as output. Sample Input array : ""Ajeet", "Ahmed","Ali","Tom"
 *
 */
public class ArrayListExercise {
	
	public static ArrayList<String> addElements(String[] input) {

		ArrayList<String> result = new ArrayList<String>(Arrays.asList(input));
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "Ajeet", "Ahmed", "Ali", "Tom" };

		ArrayList<String> result = addElements(array);
		System.out.println("Iteraton example");
		for (int i = 0; i < result.size(); i++) {
			System.out.println("Item on index " + i + " is: " + result.get(i));
		}

	}
}

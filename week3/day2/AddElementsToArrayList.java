package week3.day2.appcode;

/****
 * Write a Method called addElements() that takes in 
 *
 * //input as a String Array and adds the elements to arrayList of Strings and returns the ArrayList<String> as output.
 * ""Ajeet", "Ahmed","Ali","Tom"
 ***/
import java.util.ArrayList;

public class AddElementsToArrayList {

	public static void main(String[] args) {

		String[] names = { "Ajeet", "Ahmed", "Ali", "Tom" };
		ArrayList<String> obj = new ArrayList<String>();
		obj = addElements(names);
		System.out.println(obj);

	}

	public static ArrayList<String> addElements(String[] words) {
		ArrayList<String> obj = new ArrayList<String>();
		for (String str : words) {
			System.out.println(" The String value " + str);
			// Adding
			obj.add(str);
		}
		return obj;
	}
}

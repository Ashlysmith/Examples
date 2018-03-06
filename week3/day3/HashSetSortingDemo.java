package week3.day3.appcode;

/* Program to Sort a HashSet using two different 
 * methods. 
 * Method 1:By using List interface
 * Method 2:By using TreeSet
 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetSortingDemo {
	public static void main(String args[]) {

		HashSet<String> fruits = new HashSet<String>();

		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pear");

		System.out.println("HashSet elements before sorting: " + fruits);

		// Method 1: Sorting HashSet using List interface
		List<String> fruitList = new ArrayList<String>(fruits);
		Collections.sort(fruitList);

		// Displaying list
		System.out.println("HashSet elements after sorting: " + fruitList);

		// Method 2: Sorting using TreeSet
		TreeSet<String> tset = new TreeSet<String>(fruits);

		System.out.println("HashSet elements after using TreeSet: " + tset);
	}

}

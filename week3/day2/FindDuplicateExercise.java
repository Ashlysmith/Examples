package week3.day2.appcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Exercise: Write a method called findDuplicates() that will take Array Of
 * Strings and will return duplicate elements in the array as a arrayList. *
 * String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
 *
 * The output should be “Java” in the arrayList.
 ***/
public class FindDuplicateExercise {

	public static ArrayList<String> findDuplicates1(String[] input) {

		ArrayList<String> dups = new ArrayList<String>();

		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					// duplicate element found
					dups.add(input[i]);
					break;
				}
			}
		}
		return dups;
	}

	public static ArrayList<String> findDuplicates(String[] array) {
		Set<String> hset = new HashSet<String>();
		ArrayList<String> duplicates = new ArrayList<String>();

		for (String i : array) {
			if (!hset.add(i)) {
				System.out.println("duplicate element in array is : " + i);
				duplicates.add(i);
			}
		}
		return duplicates;
	}

	public static void main(String[] args) {

		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		ArrayList<String> result = findDuplicates(names);
		System.out.println(result);
		System.out.println("***************");
		ArrayList<String> result1 = findDuplicates1(names);
		System.out.println(result1);

	}

}

package week4.day2.appcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/****
 * 
 * Write a method called removeDuplicates takes a integer array and returns the
 * non duplicates in different integer array.This has to be done without using
 * Collection classes e.g. Set or ArrayList. Algorithm for this method is
 * simple, first sort the array and then compare adjacent objects, leaving out
 * duplicates, which is already in the result. Input Array {1, 1, 2, 2, 3, 4, 5}
 * 
 * OutputArray {3,4,5}
 *
 */
public class RemoveDupsExcercise {
	
	public static int[] removeDupsCollections(int[] numbers) {

		Arrays.sort(numbers);
		ArrayList<Integer> results = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>(numbers.length);

		for (int value : numbers) {

			if (!set.contains(value)) {
				set.add(value);
			} else {
				results.add(value);
			}
	
		}
		
		int size = results.size();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = results.get(i);
		}
	
		return arr;
	}

	public static int[] removeDuplicates(int[] numbers) {

		Arrays.sort(numbers);
		//ArrayList<Integer> results = new ArrayList<Integer>();
		int[] output = new int[numbers.length];
		HashSet<Integer> set = new HashSet<Integer>(numbers.length);

		int count = 0;
		for (int value : numbers) {

			if (!set.contains(value)) {
				set.add(value);

			} else {

				output[count] = value;
	
				count++;
			}

		}

		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = output[i];
		}
	
		return arr;
	}

	public static void main(String[] args) {

		int[] inputArray = { 1, 1, 2, 2, 3, 4, 5 };

		int[] intArray = removeDuplicates(inputArray);
		int[] array = removeDupsCollections(inputArray);
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(array));

	}
}

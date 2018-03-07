package week4.day1.appcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 * Arrays: Print Array Pairs: write a program to find all pairs of integers
 * whose sum is equal to a given number. For example if input integer array is
 * {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}. The
 * printArray(int[],sum)
 *
 */

public class SumExcercise {
	
	public static ArrayList<String> printPairsUsingSet(int[] numbers, int n) {
		ArrayList<String> results = new ArrayList<String>();
		if (numbers.length < 2) {
			return results;
		}
		
		HashSet<Integer> set = new HashSet<Integer>(numbers.length);
	
		
		for (int value : numbers) {
			int target = n - value;
			
			// if target number is not in set then add
			if(!set.contains(target)) {
				set.add(value);
				
			} else {
				System.out.println("printPairsUsingSet " + value + "+" + target);
				results.add(value + "+" + target);
			}
		//	System.out.println(results);
				
		}
		return results;
	}

	public static ArrayList<String> printPairsUsingTwoPointers(int[] array, int k) {

		ArrayList<String> results = new ArrayList<String>();
		if (array.length < 2) {
			return results;
		}
		Arrays.sort(array);
		// printPairs(input, sum);
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			int sum = array[left] + array[right];
			if (sum == k) {
				results.add(array[left] + "+" + array[right]);
				left = left + 1;
				right = right - 1;

			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}
		}
		return results;
	}

	public static ArrayList<String> printPairs(int[] array, int sum) {
		ArrayList<String> results = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					results.add(first + "+" + second);
				}
			}
		}
		return results;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 0, 2, 6, 3, 9, 11 };
		int k = 9;

		Arrays.sort(array);
		
		System.out.println("printPairsUsingTwoPointers");
		ArrayList<String> results1 = printPairsUsingTwoPointers(array, k);
		for (String result : results1) {
			System.out.println("(" + result + ") = "+ k);
		}
		
		System.out.println("printPairsUsingSet");
		ArrayList<String> results2 = printPairsUsingSet(array, k);
		System.out.println(results2);
		for (String result : results2) {
			System.out.println("(" + result + ") = "+ k);
		}
		
		System.out.println("printPairs");
		ArrayList<String> results3 = printPairs(array, k);
		for (String result : results3) {
			System.out.println("(" + result + ") = "+ k);
		}

	}

}

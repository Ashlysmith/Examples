package week3.day1.appcode;

/**
 * Exercise: Write a method called Calculator() takes 2 arguments and calculates
 * the sum and returns the result. write a test code called calculatorTest that
 * will take input from the dataprovider like this { 2, 5, 7 } , 2 and 5 are
 * input values and 7 is the expected result I want to pass 3 sets of inputs to
 * dataprovider. { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 }
 **/

public class Calculator {

	public static void main(String[] args) {

		System.out.println("answer is " + add(1, 2));
		System.out.println("subtract is " + subtract(4, 2));
		System.out.println("Multiply is " + multiply(4, 2));
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

}

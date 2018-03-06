package week3.day3.appcode;

public class ExceptionHandlingDemo {
	
	public static void main(String args[]) {
		int array[] = { 20, 20, 40 };
		int num1 = 15, num2 = 10;
		int result = 10;
		try {
			result = num1 / num2;
			System.out.println("The result is" + result);
			for (int i = 5; i >= 0; i--) {
				System.out.println("The value of array is" + array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by Zero" + e);
		}
	}
}

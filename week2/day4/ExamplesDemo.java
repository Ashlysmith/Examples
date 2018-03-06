package week2.day4.appcode;



/**
 * 
 * Write a method called reverseArray() that takes input Array of numbers 
   numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } and returns the reversedArray {10,9,8,7,6,5,4,3,2,1}
   Write a test code for the method and test it using the mvn command that we learnt
 *
 */
public class ExamplesDemo {
	public static int[] reverseArray(int[] array) {
		
		for(int i=0; i<array.length / 2; i++){ 
			int temp = array[i]; 
			array[i] = array[array.length -i -1]; 
			array[array.length -i -1] = temp; 
		}

		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intarray =  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Array before reverse:");		
		for (int i = 0; i < intarray.length; i++) {
			System.out.print(intarray[i]+" ");
		}

		int[] result = reverseArray(intarray);
		
		System.out.println("\nArray after reverse:");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
	}

}

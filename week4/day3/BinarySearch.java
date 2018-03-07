ackage com.week4.day3.examples;

import java.util.Arrays;

public class BinarySearch {
	
	
	public static void main(String[] args){
	
	int[] input= {2,3,4,5,6,8,9};
	int key =6;
	int index = performBinarySearch(input, key);

    if (index == -1) {
        System.out.printf("Sorry, %d is not found in array %n", key);
    } else {
        System.out.printf("%d is found in array at index %d %n", key, index);
    }


	}




/**
 * Java method to perform binary search. It accept an integer array and a
 * number and return the index of number in the array. If number doesn't
 * exists in array then it return -1
 *
 * @param input
 * @param number
 * @return index of given number in array or -1 if not found
 */
public static int performBinarySearch(int[] input, int number) {
	
	Arrays.sort(input);
	//SeachKey=6
    int low = 0;
    int high = input.length - 1;//6
//     0 1 2 3 4 5 6
       //0,8,2,5,6,4,3,1
    //{2,3,4,5,6,8,9};
    //low=(mid+1)=4
    //high=4
    while (high >= low) {
        int middle = (low + high) / 2;  //4
        if (input[middle] == number) {
            return middle;
        } else if (input[middle] < number) {
            low = middle + 1;
        } else if (input[middle] > number) {
            high = middle - 1;
        }
    }
    return -1;
}

}

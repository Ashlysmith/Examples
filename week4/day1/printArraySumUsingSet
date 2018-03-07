package com.week4.day1;

import java.util.Arrays;
import java.util.HashSet;

public class printArraySumUsingSet {

    public static void main(String args[]) {
    	int[] input={2,6,3,9,11};
      //prettyPrint(getRandomArray(9), 11);
       prettyPrint(input, 12);
    }

    /**
     * Given an array of integers finds two elements in the array whose sum is equal to n.
     * @param numbers
     * @param n
     */
    public static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }        
        HashSet<Integer> set = new HashSet<Integer>(numbers.length);
        
        for(int value : numbers){
            int target = n - value;
            
            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

    /*
     * Utility method to find two elements in an array that sum to k.
     */
    public static void prettyPrint(int[] random, int k){
        System.out.println("Random Integer array : " + Arrays.toString(random));
        System.out.println("Sum : " + k);
        System.out.println("pair of numbers from an array whose sum equals " + k);
        printPairsUsingSet(random, k);
    }
    
    /**
     * Utility method to return random array of Integers in a range of 0 to 15
     */
    public static int[] getRandomArray(int length){
        int[] randoms = new int[length];
        for(int i=0; i<length; i++){
            randoms[i] = (int) (Math.random()*15);
        }
        return randoms;
    }


} 




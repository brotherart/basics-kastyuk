package com.belhard.basics.arrays.sorting;

import java.util.Arrays;

import com.belhard.basics.util.arrayBubble;
import com.belhard.basics.util.getInt;

public class Task1 {

	public static void main(String[] args) {
		
		int masLength = getInt.getIntFromConsole(0, "length of array");
		int[] nums = new int[masLength];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 200 - 100);
			System.out.println("nums["+i+"]= " + nums[i]);
		}
		
		System.out.println("Array: " + Arrays.toString(nums));
		
		arrayBubble.bubbleSort(nums);
		System.out.println("Array with bubble sort: " + Arrays.toString(nums));
	}
}

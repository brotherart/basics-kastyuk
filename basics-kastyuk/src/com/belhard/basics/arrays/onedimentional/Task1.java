package com.belhard.basics.arrays.onedimentional;

import com.belhard.basics.util.getInt;

public class Task1 {

	public static void main(String[] args) {
		
		int N = getInt.getIntFromConsole(0, "length of mas");
		int k = getInt.getIntFromConsole(0, "multiple number");
		 
		int[] nums = new int[N];
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 1000);
			System.out.println("nums["+i+"]= " + nums[i]);
			
			sum = sumOfMultipleNums(k, nums, sum, i);
        } 
		System.out.println("Sum of elements = " + sum);
	}

	private static int sumOfMultipleNums(int k, int[] nums, int sum, int i) {
		if (nums[i] % k == 0) {
		    sum += nums[i];
		}
		return sum;
	}
}

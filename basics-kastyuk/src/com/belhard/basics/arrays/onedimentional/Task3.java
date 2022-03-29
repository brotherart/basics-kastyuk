package com.belhard.basics.arrays.onedimentional;

import java.util.Arrays;

import com.belhard.basics.util.getInt;

public class Task3 {

	public static void main(String[] args) {
		
		int N = getInt.getIntFromConsole(0, "length of mas");
		int[] nums = new int[N];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 200 - 100);
			System.out.println("nums["+i+"]= " + nums[i]);
		}
		
		System.out.println("Array: " + Arrays.toString(nums));
		
		removeMinNumberOfArray(N, nums);
	}

	private static void removeMinNumberOfArray(int N, int[] nums) {
		int minElement = Integer.MAX_VALUE;
		int countMinElem = 0;
		for (int i : nums) {
			minElement = min(minElement, i);
		}
		
		int[] newNums = new int[N - countMinElem];
		int indexNewNums = 0;
		for (int i : nums) {	
			if (i == minElement) {
				countMinElem++;
			}
			if (i != minElement) {
				newNums[indexNewNums++] = i;
				System.out.print(i + " ");
			}
		}
	}
	
	public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
}

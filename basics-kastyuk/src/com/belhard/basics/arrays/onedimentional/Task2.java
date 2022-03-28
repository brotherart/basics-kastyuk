package com.belhard.basics.arrays.onedimentional;

import com.belhard.basics.util.getInt;

public class Task2 {

	public static void main(String[] args) {
		
		int N = getInt.getIntFromConsole(0, "length of mas");
		double[] nums = new double[N];
		int[] count = new int[N];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 200 - 100);
			System.out.println("nums["+i+"]= " + nums[i]);
			
			numsCounter(nums, count, i);
		}
		System.out.println("Amount of positive numbers: " + count[0]);
		System.out.println("Amount of negative numbers: " + count[1]);
		System.out.println("Amount of zero numbers: " + count[2]);
	}

	private static void numsCounter(double[] nums, int[] count, int i) {
		if (nums[i] > 0) {
			count[0]++;
		} else if (nums[i] < 0) {
			count[1]++;
		}
		else {
			count[2]++;
		}
	}
}

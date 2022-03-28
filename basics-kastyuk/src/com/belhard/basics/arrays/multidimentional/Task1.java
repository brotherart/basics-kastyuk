package com.belhard.basics.arrays.multidimentional;

import java.util.Arrays;

import com.belhard.basics.util.getInt;

public class Task1 {

	public static void main(String[] args) {
		
		int amountOfArrays = getInt.getIntFromConsole(0, "amount of arrays");
		int amountOfElements = getInt.getIntFromConsole(0, "amount of elements");
		int[][] nums = new int[amountOfArrays][amountOfElements];
		
		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = (int) (Math.random() * 100);
			}
			System.out.println(Arrays.deepToString(nums));
        } 		
	}
}

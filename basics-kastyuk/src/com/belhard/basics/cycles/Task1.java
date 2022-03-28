package com.belhard.basics.cycles;

import com.belhard.basics.util.getInt;

public class Task1 {

	public static void main(String[] args) {
		
		int enteredNumber = getInt.getIntFromConsole(0, "any integer number");

		int sum = counter(enteredNumber); 
		System.out.println("Sum of numbers from \"1\" to the number you enter: " + sum);
	}

	private static int counter(int enteredNumber) {
		int sum = 0;
		for (int i = 1; i <= enteredNumber; i++) {
			sum += i;
		}
		return sum;
	}
}

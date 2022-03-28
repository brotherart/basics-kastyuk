package com.belhard.basics.cycles;

public class Task3 {

	public static void main(String[] args) {

		int n = 100;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(i, 2);
		}
		
		System.out.print("The sum of this numbers: " + sum);
	}
}
 
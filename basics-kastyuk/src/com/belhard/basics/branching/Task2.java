package com.belhard.basics.branching;

import com.belhard.basics.util.getDouble;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("y1 = x^2 - 3x + 9,  x <= 3");
		System.out.println("y2 = 1 / (x^3 + 6), x > 3");
		
		double x1 = getDouble.getDoubleFromConsole(0, "\"x\" for the first formula");
		if (x1 >= 3) {
			double y1 = 0;
			System.out.println("X > 3, enter another number!");
		}
		double y1 = Math.pow(x1, 2.0) - 3.0 * x1 + 9;
		
		double x2 = getDouble.getDoubleFromConsole(0, "\"x\" for the second formula");
		if (x2 < 3) {
			double y2 = 0;
			System.out.println("X < 3, enter another number!");
		}
		double y2 = (1.0 / (Math.pow(x2, 3.0) + 6));
		
		System.out.printf("y = (" + y1 + ", " + y2 + ")");
	}
}

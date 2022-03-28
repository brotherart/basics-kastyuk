package com.belhard.basics.linear;

import com.belhard.basics.util.getDouble;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("z = ((a - 3) * b / 2) + c");
		
		double a = getDouble.getDoubleFromConsole(0, "a");
		double b = getDouble.getDoubleFromConsole(0, "b");
		double c = getDouble.getDoubleFromConsole(0, "c");

		double z = ((a - 3) * b / 2) + c;
 
		System.out.println("Answer = " + z);
	}
}

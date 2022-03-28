package com.belhard.basics.linear;

import com.belhard.basics.util.getDouble;

public class Task2 {

	public static void main(String[] args) {
		
		double enteredNumber = getDouble.getDoubleFromConsole(0, "integer and fractional parts of any fractional number (nnn.ddd)");
		
		double Result = switcher(enteredNumber);
		System.out.println("Result: " + Result);
	}

	private static double switcher(double a) {
		int IntegerPart = (int) a;
		int FractionalPart = (int) ((a - IntegerPart) * 1000);
		double Result = FractionalPart + IntegerPart / 1000.0;
		return Result;
	}
}

package com.belhard.basics.cycles;

import com.belhard.basics.util.getDouble;
import com.belhard.basics.util.getInt;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("y = x + 4,  x > 2");
		System.out.println("y = -x * 2, x <= 2");

		double a = getDouble.getDoubleFromConsole(0, "start number");;
		double b = getDouble.getDoubleFromConsole(0, "end number");;
		
		double h = getDouble.getDoubleFromConsole(0, "step for section");
		double y = 0;
		
		counter(a, b, h, y);
	}

	private static void counter(double a, double b, double h, double y) {
		for (double x = a; x <= b; x += h) {
			if (x > 2) {
				y = x + 4;
	        } 
			else if(x <= 2) {
              y = -x * 2;
			}
			
			System.out.println("При х = " + x + " у = " + y);
		}
	}
}

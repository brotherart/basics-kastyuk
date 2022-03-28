package com.belhard.basics.branching;

import com.belhard.basics.util.getInt;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("max{min(a, b), min(c, d)}");
				
		int a = getInt.getIntFromConsole(0, "number \"a\"");
		int b = getInt.getIntFromConsole(0, "number \"b\"");
		int c = getInt.getIntFromConsole(0, "number \"c\"");
		int d = getInt.getIntFromConsole(0, "number \"d\"");
		
		int max = solveMin(a, b, c, d);
	}
 
	private static int solveMin(int a, int b, int c, int d) {
		
		int minAB;
		if (b < a) {
			minAB = b;
		}
		else {
			minAB = a;
		}
		System.out.print("The minimum for pair {a, b}: " + minAB);
		
		int minCD;
		if (d < c) {
			minCD = d;
		}
		else {
			minCD = c;
		}
		System.out.println();
		System.out.print("The minimum for pair {c, d}: " + minCD);
		
		int max;
		if (minAB > minCD) {
			max = minAB;
		}
		else {
			max = minCD;
		}
		System.out.println();
		System.out.print("The maximum of all task: " + max);
		
		return max;
	}
	
	
}

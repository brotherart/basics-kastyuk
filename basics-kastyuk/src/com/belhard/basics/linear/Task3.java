package com.belhard.basics.linear;

import com.belhard.basics.util.getInt;

public class Task3 {

	public static void main(String[] args) {
		
		int EnteredNumber = getInt.getIntFromConsole(0, "number of seconds");
		
		System.out.print("Time in normal format: ");
		timeInNormalFormat(EnteredNumber);
	}

	private static void timeInNormalFormat(int EnteredNumber) {
		int hour = (EnteredNumber / 3600);
		int min = EnteredNumber % 3600 / 60;
		int sec = EnteredNumber % 3600 % 60;
		 
		System.out.print(hour + "h ");
		System.out.print(min + "min ");
		System.out.print(sec + "s");
	}
}

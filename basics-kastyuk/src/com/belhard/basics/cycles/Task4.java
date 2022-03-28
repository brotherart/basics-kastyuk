package com.belhard.basics.cycles;

import com.belhard.basics.util.getInt;

public class Task4 {

	public static void main(String[] args) {

		char a = (char) getInt.getIntFromConsole(0, "any number, that > \"32\" and < \"127\"");

		System.out.println((int)a + " -> " + a);
	}
} 

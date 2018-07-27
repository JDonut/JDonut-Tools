package jdonut.utils;

import java.util.ArrayList;

public class Prints {
	private static final ArrayList<String> printsString = new ArrayList<String>();
	/**
	 * gets the arraylist for all the printed strings.
	 */
	public static ArrayList<String> getPrints() {
		return printsString;
	}
	
	/**
	 * prints all the recent prints to the output.
	 * only prints the output from the output supplied by
	 * JDonut.
	 */
	public static void printAllPrints() {
		System.out.println(printsString);
	}
	

}

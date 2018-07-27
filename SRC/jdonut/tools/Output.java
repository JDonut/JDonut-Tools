package jdonut.tools;

import java.util.ArrayList;

import jdonut.utils.Prints;

public class Output {
	
    private static ArrayList<String> prints = Prints.getPrints();
	
	/**
	 * Prints arg1 on a new line.
	 */
	public static void println(String arg1) {
		System.out.println(arg1);
		prints.add(arg1);
	}
	/**
	 * Prints arg1 on a new line.
	 */
	public static void println(int arg1) {
		System.out.println(arg1);
		String print = Integer.toString(arg1);
		prints.add(print);
	}
	/**
	 * Prints arg1 on a new line.
	 */
	public static void println(boolean arg1) {
		System.out.println(arg1);
		String print = String.valueOf(arg1);
		prints.add(print);
	}
	
	/**
	 * prints arg1.
	 */
	public static void print(String arg1) {
		System.out.print(arg1);
		prints.add(arg1);
	}
	/**
	 * Prints arg1.
	 */
	public static void print(int arg1) {
		System.out.print(arg1);
		String print = Integer.toString(arg1);
		prints.add(print);
	}
	/**
	 * Prints arg1.
	 */
	public static void print(boolean arg1) {
		System.out.print(arg1);
		String print = String.valueOf(arg1);
		prints.add(print);
	}
	
}

package Chap2Lab_RE;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		// n1, n2, d1, d2, word1, word2, junk, line
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter two whole numbers");
		System.out.println("separated by one or more spaces:");

		int n1 = keyboard.nextInt();
		int n2 = keyboard.nextInt();

		System.out.println("You entered " + n1 + " and " + n2);
		System.out.println("Next enter two numbers.");
		System.out.println("A decimal point is OK");

		double d1 = keyboard.nextDouble();
		double d2 = keyboard.nextDouble();

		System.out.println("You entered " + d1 + " and " + d2);
		System.out.println("Next enter two words:");

		String word1 = keyboard.next();
		String word2 = keyboard.next();

		System.out.println("You entered \"" + word1 + "\" and \"" + word2 + "\"");

		String junk = keyboard.nextLine();

		System.out.println("Next enter a line of text:");

		String line = keyboard.nextLine();

		System.out.println("You entered \""+line+"\"");		
	}
}

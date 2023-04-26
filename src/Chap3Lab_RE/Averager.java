package Chap3Lab_RE;

import java.util.Scanner;

public class Averager {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a list of nonnegative scores.");
		System.out.println("Mark the end with a negative number.");
		System.out.println("I will compute their average.");

		double input, sum = 0;
		int cnt = 0;
		input = keyboard.nextDouble();

		while (input >= 0) {
			sum += input;
			cnt++;
			input = keyboard.nextDouble();
		}

		if (cnt == 0)
			System.out.println("No scores entered.");
		else {
			System.out.println(cnt + " scores read.");
			System.out.println("The average is " + sum/cnt);
		}
	}
}

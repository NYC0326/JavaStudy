package Chap3Lab_RE;

import java.util.Scanner;

public class Averager2 {
	public static void main(String[] args) {
		// use for statement
		// if the score is not entered, show "No scores entered."
		Scanner keyboard = new Scanner(System.in);
		double score, sum = 0;
		int n, cnt = 0;
		System.out.println("Enter the number of nonnegative scores.");
		n = keyboard.nextInt();
		System.out.println("Enter a list of " + n + " nonnegative scores.");
		System.out.println("I will compute their average.");
		for (int i = 0; i < n; i++) {
			score = keyboard.nextDouble();
			sum += score;
			cnt++;
		}
		if(cnt==0)
			System.out.println("No scores entered.");
		else
			System.out.println("The average is " + sum/cnt);
	}
}

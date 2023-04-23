package Chap3Lab_RE;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		// netIncome, tax, use if-else
		Scanner keyboard = new Scanner(System.in);
		double netIncome, tax;

		System.out.println("Enter net income.");
		System.out.println("Do not include a dollar sign or any commas.");
		netIncome = keyboard.nextInt();
		if (netIncome <= 15000)
			tax = 0;
		else if (netIncome <= 30000)
			tax = 0.05 * (netIncome - 15000);
		else
			tax = 0.05 * 15000 + 0.1 * (netIncome - 30000);
		
		System.out.printf("Tax due = $%.2f", tax);
	}
}

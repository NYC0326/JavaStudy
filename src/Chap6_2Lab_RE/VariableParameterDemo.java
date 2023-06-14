package Chap6_2Lab_RE;

import java.util.Scanner;

public class VariableParameterDemo {
	public static void main(String[] args) {
		System.out.println("Enter scores for Tom, Dick, and Harriet");
		Scanner keyboard = new Scanner(System.in);
		int tomScore = keyboard.nextInt();
		int dickScore = keyboard.nextInt();
		int harrietScore = keyboard.nextInt();
		int highestScore = UtilityClass.max(tomScore, dickScore, harrietScore);
		System.out.println("Highest score = " + highestScore);
	}
}

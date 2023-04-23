import java.util.Scanner;

public class Averager2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n, cnt = 0;
		double score, sum = 0;
		System.out.println("Enter the number of nonnegative scores.");
		n = keyboard.nextInt();
		System.out.printf("Enter a list of %d nonnegative scores.\n", n);
		System.out.println("I will compute their average");
		
		for (int i = 0; i < n; i++) {
			score = keyboard.nextDouble();
			sum += score;
			cnt++;
		}
		if(cnt==0)
			System.out.println("No scores entered");
		else {
			double average = sum / cnt;
			System.out.println("The average is " + average);
		}
	}
}
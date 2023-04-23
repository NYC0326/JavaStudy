package Chap3Lab_RE;

public class WhileDemo {
	public static void main(String[] args) {
		// countDown 3 0
		System.out.println("First while loop:");
		int countDown = 3;
		while (countDown > 0) {
			System.out.println("Hello");
			countDown--;
		}
		System.out.println("Second while loop:");
		countDown = 0;
		while (countDown > 0) {
			System.out.println("Hello");
			countDown--;
		}
		System.out.println("First do-while loop:");
		countDown = 3;
		do{
			System.out.println("Hello");
			countDown--;
		} while (countDown > 0);
		System.out.println("Second do-while loop:");
		countDown = 0;
		do{
			System.out.println("Hello");
			countDown--;
		} while (countDown > 0);
	}
}

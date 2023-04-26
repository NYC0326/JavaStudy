package Chap3Lab_RE;

import java.util.Random;

public class CoinFlipDemo {
	public static void main(String[] args) {
		// int coinFlip : 1 -> Heads, else -> Tails
		Random randomGenerator = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.printf("Flip number %d: ", i+1);
			int coinFlip = randomGenerator.nextInt(2);
			if (coinFlip == 1)
				System.out.println("Heads");
			else
				System.out.println("Tails");
		}
	}
}

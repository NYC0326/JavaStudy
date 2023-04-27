package Chap4_2Lab_RE;

import java.util.Scanner;

public class PetDemo {
	public static void main(String[] args) {
		Pet usersPet = new Pet("Jane Doe");
		System.out.println("My records on you pet are incomplete.");
		System.out.println(usersPet);

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the pet's name:");
		String name = keyboard.nextLine();
		usersPet.setName(name);
		System.out.println(usersPet);
		System.out.println("Please enter the pet's age:");
		int age = keyboard.nextInt();
		usersPet.setAge(age);
		System.out.println(usersPet);
		System.out.println("Please enter the pet's weight:");
		double weight = keyboard.nextDouble();
		usersPet.setWeight(weight);
		System.out.println("My records now say:");
		System.out.println(usersPet);
	}
}

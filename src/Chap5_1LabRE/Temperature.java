package Chap5_1LabRE;

import java.util.Scanner;

public class Temperature {
	private double degrees;

	public Temperature() {
		this.degrees = 0;
	}

	public Temperature(double degrees) {
		this.degrees = degrees;
	}

	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}

	public double getDrgrees() {
		return this.degrees;
	}

	public String toString() {
		return this.degrees + "C";
	}

	public boolean eqauls(Temperature otherTemperature) {
		return this.degrees == otherTemperature.degrees;
	}

	public static double toCelsius(double degreesF) {
		return 5 * (degreesF - 32) / 9;
	}
	
	public static void main(String[] args) {
		double degreesF;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter degrees Fahrenheit:");
		degreesF = keyboard.nextDouble();
		Temperature temperature = new Temperature(toCelsius(degreesF));
		System.out.println("Equivalent Celsius temperature is " + temperature);
	}
}

import java.util.Scanner;

public class Temperature {
	private double degrees;

	public Temperature() {
		degrees = 0;
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
		return (this.degrees + " C");
	}

	public boolean equals(Temperature othTemperature) {
		return (this.degrees == othTemperature.degrees);
	}

	public static double toCelsius(double degreesF) {
		return 5 * (degreesF - 32) / 9;
	}

	public static void main(String[] args) {
		double degreesF, degreesC;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter degrees Fahrenheit:");
		degreesF = keyboard.nextDouble();

		degreesC = toCelsius(degreesF);
		Temperature temperatureObject = new Temperature(degreesC);
		System.out.println("Equivalent Celsius temperature is " + temperatureObject.toString());
	}
}

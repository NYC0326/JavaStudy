package Chap5_1LabRE;

public class RoundStuff {
	private static final double PI = 3.14159;
	
	public static double area(double radius) {
		return (PI * radius * radius);
	}

	public static double volume(double radius) {
		return ((4 / 3.0) * PI * radius * radius * radius);
	}
}

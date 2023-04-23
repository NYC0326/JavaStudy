/**
 * Java2nd5th
 */
public class Java2nd5th {
	public static void main(String[] args) {
		double price = 19.8;
		System.out.print("$");
		System.out.printf("%6.2f", price);
		System.out.println(" each");
		
		double value = 12.123;
		System.out.printf("Start%8.2fEnd\n", value);
		System.out.printf("Start%-8.2fEnd%n", price);
	}
}

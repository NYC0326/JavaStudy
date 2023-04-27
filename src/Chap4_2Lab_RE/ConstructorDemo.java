package Chap4_2Lab_RE;

public class ConstructorDemo {
	public static void main(String[] args) {
		DateExtended date1 = new DateExtended("December", 16, 1770),
					 date2 = new DateExtended(1, 27, 1756),
					 date3 = new DateExtended(1882),
					 date4 = new DateExtended(date1),
					 date5 = new DateExtended();
		System.out.println("Whose birthday is " + date1 + "?");
		System.out.println("Whose birthday is " + date2 + "?");
		System.out.println("Whose birthday is " + date3 + "?");
		System.out.println("Whose birthday is " + date4 + "?");
		System.out.println("The default date is " + date5 + ".");
	}
}

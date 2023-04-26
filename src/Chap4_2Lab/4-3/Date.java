import java.util.Scanner;

public class Date {
	private String month;
	private int day;
	private int year;

	public void setDate(int month, int day, int year) {
		if (dateOK(month, day, year)) {
			this.month = monthString(month);
			this.day = day;
			this.year = year;
		}
		else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	public void setDate(String month, int day, int year) {
		if (dateOK(month, day, year)) {
			this.month = month;
			this.day = day;
			this.year = year;
		}
		else{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	public void setDate(int year) {
		setDate(1, 1, year);
	}

	public void setMonth(int month) {
		if ((month >= 1) && (month <= 12)) {
			this.month = monthString(month);
		}
		else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	public void setDay(int day) {
		if ((day >= 1) && (day <= 31)) {
			this.day = day;
		}
		else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	public void setYear(int year) {
		if((year >= 1000) && ( year <= 9999)) {
			this.year = year;
		}
		else{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	public String toString() {
		return month + " " + day + ", " + year;
	}

	public void writeOutput() {
		System.out.println(toString());
	}

	public void readInput() {
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		while (tryAgain) {
			System.out.println("Enter month, day, and year");
			System.out.println("Do not use a comma");
			String monthInput = keyboard.next();
			int dayInput = keyboard.nextInt();
			int yearInput = keyboard.nextInt();
			if (dateOK(monthInput, dayInput, yearInput)) {
				setDate(monthInput, dayInput, yearInput);
				tryAgain = false;
			}
			else {
				System.out.println("Illegal date. Reenter input.");
			}
		}
	}

	private String monthString(int monthNumber) {
		switch (monthNumber) {
			case 1:
				return "January";
			case 2:
				return "February";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default:
				System.out.println("Fatal Error");
				System.exit(0);
				return "Error";
		}
	}
	
	public boolean equals(Date otherDate) {
        return((month.equals(otherDate.month)) && (day ==  otherDate.day) && (year == otherDate.year));
    }

	private boolean dateOK(int monthInt, int dayInt, int yearInt) {
		return ((monthInt >= 1) && (monthInt <= 12) && (dayInt >= 1)
				&& (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
	}
	
	private boolean dateOK(String monthString, int dayInt, int yearInt) {
		return (monthOK(monthString) && (dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
	}

	private boolean monthOK(String month){
		return (month.equals("January") || month.equals("February") ||
				month.equals("March") || month.equals("April") ||
				month.equals("May") || month.equals("June") ||
				month.equals("July") || month.equals("August") ||
				month.equals("September") || month.equals("October") ||
				month.equals("November") || month.equals("December"));
	}
}
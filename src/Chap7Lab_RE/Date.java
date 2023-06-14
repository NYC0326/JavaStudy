package Chap7Lab_RE;

import java.util.Scanner;

public class Date {
	private String month;
	private int day;
	private int year;

	public Date() {
		month = "January";
		day = 1;
		year = 1000;
	}

	public Date(int month, int day, int year) {
		setDate(month, day, year);
	}

	public Date(String month, int day, int year) {
		setDate(month, day, year);
	}

	public Date(int year) {
		setDate(1, 1, year);
	}

	public Date(Date aDate) {
		if (aDate == null) {
			System.out.println("Fatal Error");
			System.exit(0);
		}

		month = aDate.month;
		day = aDate.day;
		year = aDate.year;
	}

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

	public void setYear(int year) {
		if ((year < 1000) || (year > 9999)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else
			this.year = year;
	}
	
	public void setMonth(int monthNumber) {
		if ((monthNumber <= 0) || (monthNumber > 12)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else
			month = monthString(monthNumber);
	}
	
	public void setDat(int day) {
		if ((day <= 0) || (day > 31)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else
			this.day = day;
	}
	
	public int getMonth() {
		if (month.equals("January"))
			return 1;
		else if (month.equals("February"))
			return 2;
		else if (month.equals("March"))
			return 3;
		else if (month.equals("April"))
			return 4;
		else if (month.equals("May"))
			return 5;
		else if (month.equals("June"))
			return 6;
		else if (month.equals("July"))
			return 7;
		else if (month.equals("August"))
			return 8;
		else if (month.equals("September"))
			return 9;
		else if (month.equals("October"))
			return 10;
		else if (month.equals("November"))
			return 11;
		else if (month.equals("December"))
			return 12;
		else {
			System.out.println("Fatal Error");
			System.exit(0);
			return 0;
		}
	}
	
	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return (month + " " + day + ", " + year);
	}

	public boolean equals(Date otherDate) {
		return ((month.equals(otherDate.month)) && (day == otherDate.day) && (year == otherDate.year));
	}

	public Boolean precedes(Date otherDate) {
		return ((year < otherDate.year) || (year == otherDate.year && getMonth() < otherDate.getMonth()) ||
				(year == otherDate.year && month.equals(otherDate.month) && day < otherDate.day));
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
			} else
				System.out.println("Illegal date. Reenter input");
		}
	}
	
	private boolean dateOK(int monthInt, int dayInt, int yearInt) {
		return ((monthInt >= 1) && (monthInt <= 12) && (dayInt >= 1)
				&& (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
	}
	
	private boolean dateOK(String monthString, int dayInt, int yearInt) {
		return (monthOK(monthString) && (dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
	}

	private boolean monthOK(String month) {
		return (month.equals("January") || month.equals("February") ||
				month.equals("March") || month.equals("April") ||
				month.equals("May") || month.equals("June") ||
				month.equals("July") || month.equals("August") ||
				month.equals("September") || month.equals("October") ||
				month.equals("November") || month.equals("December"));
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
}
import javax.print.attribute.DateTimeSyntax;

public class Person {
	private String name;
	private Date born;
	private Date died;

	public Person(String name, Date birth, Date death) {
		if (consistent(birth, death)) {
			this.name = name;
			this.born = new Date(birth);
			if (death == null)
				died = null;
			else
				died = new Date(death);
		} else {
			System.out.println("Inconsistent dates. Aborting");
			System.exit(0);
		}
	}
	
	public Person(Person original) {
		if (original == null) {
			System.out.println("Fatal error.");
			System.exit(0);
		}

		name = original.name;
		born = new Date(original.born);

		if (original.died == null)
			died = null;
		else
			died = new Date(original.died);
	}
	
	public String toString() {
		String diedString;
		if (died == null)
			diedString = "";
		else
			diedString = died.toString();
		return (name + ", " + born + "-" + diedString);
	}
	
	public boolean equals(Person otherPerson) {
		if (otherPerson == null)
			return false;
		else
			return (name.equals(otherPerson.name)
					&& (born.equals(otherPerson.born) && datesMatch(died, otherPerson.died)));
	}

	private static boolean datesMatch(Date date1, Date date2) {
		if (date1 == null)
			return (date2 == null);
		else if (date2 == null)
			return false;
		else
			return (date1.equals(date2));
	}

	public void setBirthDate(Date date) {
		if (consistent(date, died))
			born = new Date(date);
		else {
			System.out.println("Inconsistent dates. Aborting.");
			System.exit(0);
		}
	}

	public void setDeathDate(Date date) {
		if (!consistent(born, date)) {
			System.out.println("Inconsistent dates. Aborting.");
			System.exit(0);
		}
		if (date == null)
			died = null;
		else
			died = new Date(date);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthYear(int year) {
		if (born == null) {
			System.out.println("Fatal Error. Aborting.");
			System.exit(0);
		}
		born.setYear(year);
		if (!consistent(born, died)) {
			System.out.println("Inconsistent dates. Aborting.");
			System.exit(0);
		}
	}

	public void setDeathYear(int year) {
		if (died == null) {
			System.out.println("Fatal Error. Aborting.");
			System.exit(0);
		}
		died.setYear(year);
		if (!consistent(born, died)) {
			System.out.println("Inconsistent dates. Aborting.");
			System.exit(0);
		}
	}

	public String getname() {
		return name;
	}

	public Date getBirthDate() {
		return new Date(born);
	}

	public Date getDeathDate() {
		if (died == null)
			return null;
		else
			return new Date(died);
	}

	public static boolean consistent(Date birth, Date death) {
		if (birth == null)
			return false;
		else if (death == null)
			return true;
		else
			return (birth.precedes(death) || birth.equals(death));
	}
}

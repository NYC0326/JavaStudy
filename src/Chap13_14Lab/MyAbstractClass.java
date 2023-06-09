package Chap13_14Lab;

public abstract class MyAbstractClass implements Ordered{
	private int number;
	private char grade;

	public boolean precedes(Object other) {
		if (other == null)
			return false;
		else if (!(other instanceof HourlyEmployee))
			return false;
		else {
			MyAbstractClass otherOfMyAbstractClass = (MyAbstractClass) other;
			return this.number < otherOfMyAbstractClass.number;
		}
	}

	public abstract boolean follows(Object other);
}

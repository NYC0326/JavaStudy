package Chap13_14Lab;

public class OrderedHourlyEmployee extends HourlyEmployee implements Ordered{
	public boolean precedes(Object other) {
		if (other == null)
			return false;
		else if (!(other instanceof OrderedHourlyEmployee))
			return false;
		else {
			OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee) other;
			return getpay() < otherOrderedHourlyEmployee.getPay();
		}
	}

	public boolean follows(Object other) {
		if (other == null)
			return false;
		else if (!(other instanceof OrderedHourlyEmployee))
			return false;
		else {
			OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee) other;
			return otherOrderedHourlyEmployee.precedes(this)
		}
	}
}

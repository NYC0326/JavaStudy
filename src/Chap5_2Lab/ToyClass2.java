public class ToyClass2{
	private String name;
	private int number;

	public void set(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String toString() {
		return (name + " " + number);
	}

	public void makeEqual(ToyClass2 anObject) {
		anObject.name = this.name;
		anObject.number = this.number;
	}

	public void tryToMakeEqual(int number) {
		number = this.number;
	}

	public boolean equals(ToyClass2 otherObject) {
		return ((name.equals(otherObject.name)) && (number == otherObject.number));
	}
}
package Chap6_2Lab_RE;

public class ToyExample {
	private Date[] a;

	public ToyExample(int arraySize) {
		a = new Date[arraySize];
		for (int i = 0; i < arraySize; i++)
			a[i] = new Date();
	}

	public ToyExample(ToyExample object) {
		int len = object.a.length;
		this.a = new Date[len];
		for (int i = 0; i < len; i++)
			this.a[i] = new Date(object.a[i]);
	}

	public Date[] getDateArray() {
		Date[] temp = new Date[a.length];
		for (int i = 0; i < a.length; i++)
			temp[i] = new Date(a[i]);
		return temp;
	}
}

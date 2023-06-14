package Chap6_2Lab_RE;

public class SelectionSortDemo {
	public static void main(String[] args) {
		double[] b = { 7.7, 5.5, 11.0, 3.0, 16.0, 4.4, 20.0, 14.0, 13.0, 42.0 };
		System.out.println("Array contents before sorting:");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		SelectionSort.sort(b, b.length);
		System.out.println("Sorted array values:");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
	}
}

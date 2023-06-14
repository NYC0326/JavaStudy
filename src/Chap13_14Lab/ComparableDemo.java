package Chap13_14Lab;

public class ComparableDemo {
	public static void main(String[] args) {
		Double[] d = { 10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0 };
		System.out.println("Before sorting");
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + ", ");
		System.out.println();
		GeneralizedSelectionSort.sort(d, d.length);
		System.out.println("After sorting:");
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + ", ");
		System.out.println();

		String[] s = { "dog", "cat", "cornish game hen" };
		System.out.println("Before sorting");
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + ", ");
		System.out.println();
		GeneralizedSelectionSort.sort(s, s.length);
		System.out.println("After sorting:");
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + ", ");
		System.out.println();
	}
}

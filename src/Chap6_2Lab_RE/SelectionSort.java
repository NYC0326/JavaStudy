package Chap6_2Lab_RE;

public class SelectionSort {
	public static void sort(double[] a, int numberUsed) {
		int index, indexOfNextSmallest;
		for (index = 0; index < numberUsed - 1; index++) {
			indexOfNextSmallest = indexOfSmallest(index, a, numberUsed);
			interchange(index, indexOfNextSmallest, a);
		}
	}

	private static int indexOfSmallest(int startIndex, double[] a, int numberUsed) {
		double min = a[startIndex];
		int indexOfMin = startIndex, index;
		for (index = startIndex + 1; index < numberUsed; index++) {
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}

	private static void interchange(int i, int j, double[] a) {
		double tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}

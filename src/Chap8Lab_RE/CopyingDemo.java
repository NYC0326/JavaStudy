package Chap8Lab_RE;

public class CopyingDemo {
	public static void main(String[] args) {
		Sale[] a = new Sale[2];
		a[0] = new Sale("atomic coffee mug", 130.00);
		a[1] = new DiscountSale("invisible pain", 5.00, 10);

		Sale[] b = badCopy(a);

		System.out.println("With copy constructors:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			System.out.println("b[" + i + "] = " + b[i]);
			System.out.println();
		}

		b = goodCopy(a);

		System.out.println("With clone method:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			System.out.println("b[" + i + "] = " + b[i]);
			System.out.println();
		}
	}
	
	public static Sale[] badCopy(Sale[] a) {
		Sale[] b = new Sale[a.length];
		for (int i = 0; i < a.length; i++)
			b[i] = new Sale(a[i]); // a[1]는 DiscountSale이므로
		return b;
	}
	
	public static Sale[] goodCopy(Sale[] a) {
		Sale[] b = new Sale[a.length];
		for (int i = 0; i < a.length; i++)
			b[i] = a[i].clone();
		return b;
	}
}

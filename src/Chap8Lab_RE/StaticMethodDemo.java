package Chap8Lab_RE;

public class StaticMethodDemo {
	public static void main(String[] args) {
		Sale.accouncement();
		DiscountSale.announcement();
		System.out.println("That showed that you can override a static method definition.");

		Sale s = new Sale();
		DiscountSale discount = new DiscountSale();
		s.accouncement();
		discount.announcement();
		System.out.println("No surprises so far, but wait.");

		Sale discount2 = discount;
		System.out.println("discount2 is a DiscouintSale object in a Sale variable.");
		System.out.println("Which definition of announcement() will it use?");
		discount2.accouncement();
		System.out.println("It used the Sale version of annonucement()!");
		DiscountSale discount4 = new DiscountSale("min", 30, 23);
		Sale discount3 = discount4;
		System.out.println(discount3.getClass());
		System.out.println(discount3 instanceof DiscountSale);
		discount3.accouncement();
		System.out.println(discount3.toString());
	}
}

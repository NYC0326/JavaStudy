public class Java1st5th {
	public static void main(String[] args) {
		String greeting = "Hello";
		String greeting2 = "hello";
		String greeting3 = "Good morning";
		int count = greeting.length();
		boolean check = greeting.equals(greeting2);
		boolean check2 = "Hello".equals("Hello");
		boolean check3 = greeting.equalsIgnoreCase(greeting2);
		boolean check4 = greeting.toUpperCase().equals(greeting2.toUpperCase());
		System.out.println("Length is " + count);
		System.out.println(check);
		System.out.println(check2);
		System.out.println(check3);
		System.out.println(check4);
		System.out.println("    asdf    ".trim());
		System.out.println(greeting.charAt(4));
		System.out.println(greeting.indexOf("llo"));
		System.out.println(greeting3.indexOf("asdf"));
		System.out.println(greeting.compareTo(greeting2));
		System.out.println(greeting.compareToIgnoreCase(greeting2));
	}
}

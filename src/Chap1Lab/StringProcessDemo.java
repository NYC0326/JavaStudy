public class StringProcessDemo {
	public static void main(String[] args) {
		String sentence = "I hate text processing!";
		System.out.println("01234567890123456789012");
		int position = sentence.indexOf("hate");
		String ending = sentence.substring(position + "hate".length());
		System.out.println(sentence);
		System.out.println("The word \"hate\" starts at index " + position);
		sentence = sentence.substring(0, position) + "adore" + ending;
		System.out.println("The changed string is:");
		System.out.println(sentence);
	}
}

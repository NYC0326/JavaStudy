package Chap9Lab_RE;

public class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("Negative Number Exception!");
	}

	public NegativeNumberException(String message) {
		super(message);
	}
}

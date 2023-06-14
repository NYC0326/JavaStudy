package Chap9Lab_RE;

public class DivisionByZeroException extends Exception {
	public DivisionByZeroException() {
		super("Division by Zero!");
	}

	public DivisionByZeroException(String message) {
		super(message);
	}
}

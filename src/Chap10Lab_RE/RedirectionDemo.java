package Chap10Lab_RE;

import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class RedirectionDemo {
	public static void main(String[] args) {
		PrintStream errStream = null;
		try {
			errStream = new PrintStream(new FileOutputStream("src/Chap10Lab_RE/errormessages.txt"));
		}
		catch (FileNotFoundException e) {
			System.err.println("Error opening file with FileOutputStream.");
			System.exit(0);
		}
		System.setErr(errStream); // err의 출력 위치를 errStream으로 지정
		System.err.println("Hello from System.err.");
		System.out.println("Hello from System.out.");
		System.err.println("Hello again from System.err.");
		errStream.close();
	}
}

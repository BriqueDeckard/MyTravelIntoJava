package java_fundamentals.stack_trace;

import java.io.PrintWriter;
import java.io.StringWriter;
import java_fundamentals.stack_trace.custom_exception.CustomCheckedException;

public class MyExceptionApp {
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		try {
			throwException();
		} catch (CustomCheckedException c) {
			c.printStackTrace(pw);
			System.out.println("cause: " + c.getCause());
		}
		System.out.println(sw);
	}

	static void throwException() throws CustomCheckedException {
		try {
			throw new IllegalArgumentException("error");
		} catch (IllegalArgumentException i) {
			throw new CustomCheckedException("Error", i);
		}

	}
}

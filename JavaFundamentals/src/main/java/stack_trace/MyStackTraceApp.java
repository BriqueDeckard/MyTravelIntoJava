package stack_trace;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class MyStackTraceApp {
	public static void main(String[] args) {
		coreJava();
		exceptionUtils();
	}

	private static void exceptionUtils() {
		HashSet<String> exceptionList = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			try {
				switch (i) {
					case 0:
						throw new ArithmeticException();
					case 1:
						throw new ArrayIndexOutOfBoundsException();
					case 2:
						throw new ArrayStoreException();
				}
			} catch (Exception e) {
				exceptionList.add(ExceptionUtils.getStackTrace(e));
			}
		}
		System.out.println(exceptionList);
	}

	private static void coreJava() {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		for (int i = 0; i < 10; i++) {
			try {
				switch (i) {
					case 0:
						throw new ArithmeticException();
					case 1:
						throw new ArrayIndexOutOfBoundsException();
					case 2:
						throw new ArrayStoreException();
				}
			} catch (Exception e) {
				e.printStackTrace(pw);
			}
		}
		System.out.println(sw);
	}
}

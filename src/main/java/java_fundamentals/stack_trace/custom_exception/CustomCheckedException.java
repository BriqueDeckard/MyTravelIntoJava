package java_fundamentals.stack_trace.custom_exception;

public class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {
		super(message);
	}

	public CustomCheckedException(String message, Throwable cause) {
		super(message, cause);
	}
}

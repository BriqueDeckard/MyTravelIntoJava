package infra;

import java.util.Optional;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.api.extension.TestWatcher;

public class TestLoggerExtension implements TestWatcher, TestExecutionExceptionHandler {

	@Override
	public void testDisabled(ExtensionContext context, Optional<String> reason) {
		System.out.println("Test Disabled for test " + context.getDisplayName() +
				" with reason :- " + reason.orElse("No reason"));
	}

	@Override
	public void testSuccessful(ExtensionContext context) {
		System.out.println("Test " + context.getDisplayName() + " succeeded");
	}

	@Override
	public void testAborted(ExtensionContext context, Throwable cause) {
		System.out.println("Test " + context.getDisplayName() + " aborted");
	}

	@Override
	public void testFailed(ExtensionContext context, Throwable cause) {
		System.out.println("Test " + context.getDisplayName() + " failed");
	}

	@Override
	public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
		System.out.println("Test " + context.getDisplayName() + " threw exception: " + throwable.getMessage());
	}
}

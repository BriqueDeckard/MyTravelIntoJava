package creational.generic_factory.example;

public class StringNotifier implements Notifier<String> {
	@Override
	public void notify(String s) {
		System.out.println("Notifying: " + s);
	}
}

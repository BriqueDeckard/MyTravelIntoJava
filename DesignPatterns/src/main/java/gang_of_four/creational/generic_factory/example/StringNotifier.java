package gang_of_four.creational.generic_factory.example;

public class StringNotifier implements Notifier<String> {
	@Override
	public void notify(String s) {
		System.out.println("Notifying: " + s);
	}
}

package java_fundamentals.anonymous_class;

@SuppressWarnings("CommentedOutCode")
public class MyAnonymousClassApp {
	public static void main(String[] args) {
		String value = "value";
		anonymousClass();
		anonymousInterface();

	}

	private static void anonymousInterface() {
		//noinspection TrivialFunctionalExpressionUsage
		((MyAnonymousInterface) value -> System.out.println(value + " are you anonymous ?")).myAnonymousMethod("42");

//		new MyAnonymousInterface() {
//			@Override
//			public void myAnonymousMethod(String value) {
//				System.out.println(value + " are you anonymous ?");
//			}
//		}.myAnonymousMethod("42");
	}

	private static void anonymousClass() {
		System.out.println(
				new MyAnonymousClass() {
					@Override
					public String getMyField() {
						return "+" + super.getMyField() + "+";
					}
				}.getMyField()
		);
	}
}

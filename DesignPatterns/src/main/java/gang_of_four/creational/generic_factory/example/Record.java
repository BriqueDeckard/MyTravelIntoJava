package gang_of_four.creational.generic_factory.example;

import java.util.Date;

public enum Record {
	STRING {
		@Override
		public Notifier<String> make() {
			return new StringNotifier();
		}
	},
	DATE {
		@Override
		public Notifier<Date> make() {
			return new DateNotifier();
		}
	};

	public abstract <T> Notifier<T> make();
}

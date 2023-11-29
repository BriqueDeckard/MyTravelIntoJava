package java_fundamentals.core_classes.enums;

import java.util.stream.Stream;

public class MyEnumUser {
	private MyEnum myEnumField;
	private MyCustomEnum myCustomEnum;

	{
		myEnumField = MyEnum.MY_FIRST_VALUE;
		myCustomEnum = MyCustomEnum.MY_FIRST_CUSTOM_VALUE;
	}

	public void setMyCustomEnum(MyCustomEnum myCustomEnum) {
		this.myCustomEnum = myCustomEnum;
	}

	public String myCustomEnumGetter() {
		return myCustomEnum.myFirstCustomCheck() + "\n" +
				myCustomEnum.myEnumValue + "\n" +
				myCustomEnum.name();
	}

	public boolean myEnumCheck() {
		switch (getMyEnumField()) {
			case MY_FIRST_VALUE, MY_SECOND_VALUE -> {
				return true;
			}
			case MY_THIRD_VALUE -> {
				return false;
			}
		}
		return false;
	}

	public MyEnum getMyEnumField() {
		return myEnumField;
	}

	public void setMyEnumField(MyEnum myEnum) {
		this.myEnumField = myEnum;
	}

	public enum MyEnum {
		MY_FIRST_VALUE,
		MY_SECOND_VALUE,
		MY_THIRD_VALUE;

		public static Stream<MyEnum> stream() {
			return Stream.of(MyEnum.values());
		}
	}

	public enum MyCustomEnum {
		MY_FIRST_CUSTOM_VALUE(1) {
			@Override
			public boolean myFirstCustomCheck() {
				return true;
			}
		},
		MY_SECOND_CUSTOM_VALUE(3) {
			@SuppressWarnings("RedundantMethodOverride")
			@Override
			public boolean myFirstCustomCheck() {
				return false;
			}
		};

		private final int myEnumValue;

		MyCustomEnum(int myEnumValue) {
			this.myEnumValue = myEnumValue;
		}

		public static Stream<MyCustomEnum> stream() {
			return Stream.of(MyCustomEnum.values());
		}

		public boolean myFirstCustomCheck() {
			return false;
		}

		@Override
		public String toString() {
			return "MyCustomEnum{" +
					"myEnumValue=" + myEnumValue +
					'}';
		}
	}
}

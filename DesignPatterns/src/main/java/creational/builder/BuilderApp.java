package creational.builder;

import creational.builder.my_imp.domain.MyComplexEntity;
import creational.builder.my_imp.services.MyComplexEntityBuilder;
import creational.builder.my_imp.services.MyComplexEntityBuilderContract;

public class BuilderApp {
	public static void main(String[] args) {
		MyComplexEntityBuilderContract myBuilder1 = new MyComplexEntityBuilder();
		final MyComplexEntity entity1 = myBuilder1.build();
		final MyComplexEntity entity2 = myBuilder1.build("MyName");
		System.out.println(entity1.toString());
		System.out.println(entity2.toString());

	}
}

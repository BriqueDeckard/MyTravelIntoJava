package creational.gof.builder;

import creational.gof.builder.my_imp.domain.MyComplexEntity;
import creational.gof.builder.my_imp.services.MyComplexEntityBuilder;
import creational.gof.builder.my_imp.services.MyComplexEntityBuilderContract;

public class BuilderApp {
    public static void main(String[] args) {
        MyComplexEntityBuilderContract myBuilder1 = new MyComplexEntityBuilder();
        final MyComplexEntity entity1 = myBuilder1.build();
        final MyComplexEntity entity2 = myBuilder1.build("MyName");
        final MyComplexEntity entity3 = new MyComplexEntity.Builder()
                .withName("NAME")
                .withBrand("BRAND")
                .withCode(42)
                .withKey("KEY")
				.build();
        System.out.println(entity1.toString());
        System.out.println(entity2.toString());
        System.out.println(entity3.toString());

    }
}

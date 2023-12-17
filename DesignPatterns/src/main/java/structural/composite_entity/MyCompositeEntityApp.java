package structural.composite_entity;

import java.util.Arrays;

public class MyCompositeEntityApp {
	public static void main(String[] args) {
		MyCompositeEntity myCompositeEntity = new MyCompositeEntity();
		myCompositeEntity.init();
		myCompositeEntity.setData("No danger", "Green light");
		Arrays.stream(myCompositeEntity.getData()).forEach(System.out::println);
		myCompositeEntity.setData("Danger", "Red light");
		Arrays.stream(myCompositeEntity.getData()).forEach(System.out::println);
	}
}

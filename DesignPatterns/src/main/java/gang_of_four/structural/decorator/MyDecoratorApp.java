package gang_of_four.structural.decorator;

public class MyDecoratorApp {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());

		System.out.println("Normal circle");
		circle.draw();

		System.out.println("Red circle");
		redCircle.draw();
	}
}

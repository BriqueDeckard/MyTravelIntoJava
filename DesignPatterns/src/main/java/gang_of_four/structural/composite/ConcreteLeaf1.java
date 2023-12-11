package gang_of_four.structural.composite;

public class ConcreteLeaf1 implements Component {
	@Override
	public void doSomething(String color) {
		System.out.println("Une feuille 1 de couleur : " + color);
	}
}

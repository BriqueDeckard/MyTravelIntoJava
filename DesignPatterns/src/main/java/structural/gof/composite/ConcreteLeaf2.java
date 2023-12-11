package structural.gof.composite;

public class ConcreteLeaf2 implements Component {
	@Override
	public void doSomething(String color) {
		System.out.println("Une feuille 2 de couleur : " + color);
	}
}
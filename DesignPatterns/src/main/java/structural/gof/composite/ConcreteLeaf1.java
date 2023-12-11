package structural.gof.composite;

public class ConcreteLeaf1 implements Component {
	@Override
	public void doSomething(String color) {
		System.out.println("Une feuille 1 de couleur : " + color);
	}
}

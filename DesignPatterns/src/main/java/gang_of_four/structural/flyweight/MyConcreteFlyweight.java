package structural.flyweight;

/**
 *  classes concrètes qui implémentent l'interface Flyweight et qui représentent les objets partagés.
 */
public class MyConcreteFlyweight implements MyFlyweight {
	private String intrinsicState;

	public MyConcreteFlyweight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void operation() {
		System.out.println("My concrete flyweight: " + intrinsicState);
	}
}

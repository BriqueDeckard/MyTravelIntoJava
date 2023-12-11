package structural.gof.bridge;

/**
 * Implémentations concrètes de l'abstraction
 */
public class RefinedAbstraction extends Abstraction {
	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void operation() {
		this.implementor.operationImpl();
	}
}

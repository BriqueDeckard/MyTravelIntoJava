package gang_of_four.structural.proxy;

/**
 * une classe qui implémente l'interface et qui effectue le travail réel.
 */
public class ExpensiveObjectImpl implements ExpensiveObject{

	public ExpensiveObjectImpl() {
		heavyInitialConfiguration();
	}

	@Override
	public void process() {
		System.out.println("processing completed.");
	}

	private void heavyInitialConfiguration() {
		// Le travail réel
		System.out.println("Loading initial configuration...");
	}
}

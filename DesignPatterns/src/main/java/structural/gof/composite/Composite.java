package structural.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private List<Component> components = new ArrayList<Component>();

	@Override
	public void doSomething(String color) {
		for (Component component : components) {
			component.doSomething(color);
		}
	}

	public void addLeaf(Component component) {
		components.add(component);
	}

	public void removeLeaf(Component component) {
		components.remove(component);
	}
}

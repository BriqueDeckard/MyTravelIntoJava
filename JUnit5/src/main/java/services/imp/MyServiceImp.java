package services.imp;

import services.contracts.MyService;

public class MyServiceImp implements MyService {
	@Override
	public String modifyString(String string) {
		return "#" + string.toString() + "#";
	}

	@Override
	public int calculateSomething(int inputNumber) {
		if (inputNumber <= 1) {
			return 1;
		}
		// calculer la valeur pour le nombre précédent
		final int x = calculateSomething(inputNumber - 1);
		// calculer la valeur pour le nombre avant précédent
		final int y = calculateSomething(inputNumber - 2);
		return x + y;
	}
}

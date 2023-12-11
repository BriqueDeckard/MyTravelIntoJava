package gang_of_four.creational.factory.example.services.contracts;


import gang_of_four.creational.factory.example.domain.contracts.MotorVehicle;

/**
 * Une abstract class qui définit "create" pour centraliser l'appel.
 * La classe qui en hérite disposera de la méthode "create()"
 * paramétrée par l'implémentation de "createMotorVehicle()"
 * <br>
 * Le code client n'a jamais besoin de connaître SomeImplementation (Car, MotorCycle),
 * et travaille plutôt en termes de SomeInterface (MotorVehicle).
 * <br>
 * Nous pouvons changer le type renvoyé par notre factory sans que le code client
 * n'ait à changer.
 * Cela peut même inclure la sélection dynamique du type au moment de l'exécution.
 */
public abstract class MotorVehicleFactory {
	public MotorVehicle create() {
		MotorVehicle vehicle = createMotorVehicle();
		vehicle.build();
		return vehicle;
	}

	protected abstract MotorVehicle createMotorVehicle();
}

package gang_of_four.structural.facade;

import gang_of_four.structural.facade.contracts.ComputerFacade;
import gang_of_four.structural.facade.impl.ComputerFacadeImp;

public class MyFacadeApp {
	public static void main(String[] args) {
		// une interface simple pour démarrer un ordinateur, en masquant les détails du sous-système de gestion de fichiers.
		ComputerFacade computerFacadeImp = new ComputerFacadeImp();
		computerFacadeImp.start();
	}
}

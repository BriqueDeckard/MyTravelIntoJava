package structural.facade;

import structural.facade.contracts.ComputerFacade;
import structural.facade.impl.ComputerFacadeImp;

public class MyFacadeApp {
	public static void main(String[] args) {
		// une interface simple pour démarrer un ordinateur, en masquant les détails du sous-système de gestion de fichiers.
		ComputerFacade computerFacadeImp = new ComputerFacadeImp();
		computerFacadeImp.start();
	}
}

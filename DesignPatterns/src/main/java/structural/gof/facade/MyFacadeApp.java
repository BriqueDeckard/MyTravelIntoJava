package structural.gof.facade;

import structural.gof.facade.contracts.ComputerFacade;
import structural.gof.facade.impl.ComputerFacadeImp;

public class MyFacadeApp {
	public static void main(String[] args) {
		// une interface simple pour démarrer un ordinateur, en masquant les détails du sous-système de gestion de fichiers.
		ComputerFacade computerFacadeImp = new ComputerFacadeImp();
		computerFacadeImp.start();
	}
}

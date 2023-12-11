package behavioral.gof.mediator;

import behavioral.gof.mediator.domain.*;

public class MyMediatorApp {
	public static void main(String[] args) {
		MyMediatorContract mediator = new MyConcreteMediator();
		MyColleagueContract colleague1 = new MyColleagueImp1(mediator);
		MyColleagueContract colleague2 = new MyColleagueImp2(mediator);

		colleague1.sendMessage("Hello ?");
		colleague2.sendMessage("Yo bru");
		colleague1.sendMessage("Wazup ?");
	}
}

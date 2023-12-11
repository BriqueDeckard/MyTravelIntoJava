package behavioral.gof.mediator.domain;

public class MyColleagueImp2 implements MyColleagueContract {
	private MyMediatorContract mediator;

	public MyColleagueImp2(MyMediatorContract mediator) {
		this.mediator = mediator;
		this.mediator.setColleague2(this);
	}

	@Override
	public void sendMessage(String message) {
		mediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("MyColleagueImp2 received message : " + message);
	}
}

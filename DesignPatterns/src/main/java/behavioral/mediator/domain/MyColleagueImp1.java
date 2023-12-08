package behavioral.mediator.domain;

public class MyColleagueImp1 implements MyColleagueContract {
	private MyMediatorContract mediator;

	public MyColleagueImp1(MyMediatorContract mediator) {
		this.mediator = mediator;
		this.mediator.setColleague1(this);
	}

	@Override
	public void sendMessage(String message) {
		mediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("MyColleagueImp1 received message : " + message);
	}
}

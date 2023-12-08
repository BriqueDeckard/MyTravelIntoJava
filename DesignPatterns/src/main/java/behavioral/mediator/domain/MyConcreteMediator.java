package behavioral.mediator.domain;

public class MyConcreteMediator implements MyMediatorContract {
	private MyColleagueContract myColleagueContract1;
	private MyColleagueContract myColleagueContract2;

	public void setColleague1(MyColleagueContract myColleagueContract1) {
		this.myColleagueContract1 = myColleagueContract1;
	}

	public void setColleague2(MyColleagueContract myColleagueContract2) {
		this.myColleagueContract2 = myColleagueContract2;
	}

	@Override
	public void sendMessage(String message, MyColleagueContract myColleagueContract) {
		if (myColleagueContract.equals(myColleagueContract1)) {
			myColleagueContract2.receiveMessage(message);
		} else if (myColleagueContract.equals(myColleagueContract2)) {
			myColleagueContract1.receiveMessage(message);
		}
	}
}

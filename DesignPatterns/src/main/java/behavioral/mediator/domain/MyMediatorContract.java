package behavioral.mediator.domain;

import behavioral.mediator.domain.MyColleagueContract;

public interface MyMediatorContract {

	void sendMessage(String message, MyColleagueContract myColleagueContract);

	void setColleague1(MyColleagueContract myColleagueContract1);

	void setColleague2(MyColleagueContract myColleagueContract2);
}

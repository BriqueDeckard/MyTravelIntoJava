package behavioral.command.concretes;

import behavioral.command.MyCommandContract;

public class MyConcreteCommandFinish implements MyCommandContract {
	@Override
	public void execute() {
		System.out.println("Finish");
	}
}

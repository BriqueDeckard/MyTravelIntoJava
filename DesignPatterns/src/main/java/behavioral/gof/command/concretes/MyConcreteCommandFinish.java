package behavioral.gof.command.concretes;

import behavioral.gof.command.MyCommandContract;

public class MyConcreteCommandFinish implements MyCommandContract {
	@Override
	public void execute() {
		System.out.println("Finish");
	}
}

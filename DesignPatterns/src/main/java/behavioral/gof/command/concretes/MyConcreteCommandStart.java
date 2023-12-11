package behavioral.gof.command.concretes;

import behavioral.gof.command.MyCommandContract;

public class MyConcreteCommandStart implements MyCommandContract {
	@Override
	public void execute() {
		System.out.println("Start");
	}
}

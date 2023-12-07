package behavioral.command.concretes;

import behavioral.command.MyCommandContract;

public class MyConcreteCommandStart implements MyCommandContract {
	@Override
	public void execute() {
		System.out.println("Start");
	}
}

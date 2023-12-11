package gang_of_four.behavioral.command.concretes;

import gang_of_four.behavioral.command.MyCommandContract;

public class MyConcreteCommandStart implements MyCommandContract {
	@Override
	public void execute() {
		System.out.println("Start");
	}
}

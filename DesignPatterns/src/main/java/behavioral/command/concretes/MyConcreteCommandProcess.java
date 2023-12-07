package behavioral.command.concretes;

import behavioral.command.MyCommandContract;

public class MyConcreteCommandProcess implements MyCommandContract {
	@Override
	public void execute() {
		System.out.println("Process");
	}
}

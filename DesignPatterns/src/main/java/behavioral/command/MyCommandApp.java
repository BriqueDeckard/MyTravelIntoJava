package behavioral.command;

import behavioral.command.concretes.MyConcreteCommandFinish;
import behavioral.command.concretes.MyConcreteCommandProcess;
import behavioral.command.concretes.MyConcreteCommandStart;
import java.util.ArrayDeque;
import java.util.Queue;

public class MyCommandApp {
	public static void main(String[] args) {
		MyCommandInvoker myCommandInvoker = new MyCommandInvoker();
		Queue<MyCommandContract> commandStack = new ArrayDeque<>();
		commandStack.offer(new MyConcreteCommandStart());
		commandStack.offer(new MyConcreteCommandProcess());
		commandStack.offer(new MyConcreteCommandFinish());

		while (!commandStack.isEmpty()) {
			myCommandInvoker.setCommand(commandStack.poll());
			myCommandInvoker.pressButton();
		}
	}
}

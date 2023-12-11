package behavioral.gof.command;

public class MyCommandInvoker {
	private MyCommandContract command;

	public void setCommand(MyCommandContract command) {
		this.command = command;
	}
	public void pressButton(){
		command.execute();
	}
}

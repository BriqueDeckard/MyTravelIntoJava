package gang_of_four.structural.facade.contracts;

public interface CPU {
	void freeze();

	void jump(long position);

	void execute();
}

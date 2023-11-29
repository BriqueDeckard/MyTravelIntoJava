package associated_frameworks.vavr;
import io.vavr.control.Option;
public class MyVavrApp {
	public static void main(String[] args) {
		// Option


	}
	static Option<String> getOption(String hello){
		return Option.of(hello);
	}
}

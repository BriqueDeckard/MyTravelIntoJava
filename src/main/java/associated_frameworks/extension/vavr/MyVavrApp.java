package associated_frameworks.extension.vavr;
import io.vavr.control.Option;
public class MyVavrApp {
	public static void main(String[] args) {
		// Option


	}
	public static Option<String> getOption(String hello){
		return Option.of(hello);
	}
}

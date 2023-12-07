package class_loaders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintClassLoader {
	public static void main(String[] args) {
		PrintClassLoader printClassLoader = new PrintClassLoader();
		printClassLoader.printClassLoader();
	}
	static final Logger LOGGER = LogManager.getLogger(PrintClassLoader.class);
	public void printClassLoader(){
		LOGGER.trace("ClassLoader of this class: {}", PrintClassLoader.class.getClassLoader());
		LOGGER.trace("ClassLoader of String class: {}", String.class.getClassLoader());


	}
}

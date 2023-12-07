package core_classes.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyIteratorApp {
	static final Logger LOGGER = LogManager.getLogger(MyIteratorApp.class);

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		Iterator<String> iterator = items.iterator();

		// Has next
		while (iterator.hasNext()) {
			// Do something with the next
			String next = iterator.next();
			LOGGER.trace("NEXT : {}", next);
			if (next.equals("B")) {
				iterator.remove();
			}
		}

		// forEachRemaining
		iterator.forEachRemaining(LOGGER::trace);

		// listIterator with a start position
		ListIterator<String> stringListIterator = items.listIterator(items.size());
		// hasPrevious
		while (stringListIterator.hasPrevious()) {
			LOGGER.trace("previous : {}", stringListIterator.previous());
		}
		ListIterator<String> myListIterator = items.listIterator();
		 LOGGER.trace("Next index : {} " , items.get(myListIterator.nextIndex()));
		 myListIterator.add("OOH");
		LOGGER.trace("Next index : {} " , items.get(myListIterator.nextIndex()));
		LOGGER.trace("Next index : {} " , items.get(myListIterator.previousIndex()));
		LOGGER.trace("Next index : {} " , items.get(myListIterator.previousIndex()));

	}
}

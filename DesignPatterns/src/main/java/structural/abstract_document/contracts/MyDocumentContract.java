package structural.abstract_document.contracts;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface MyDocumentContract {
	void put(String key, Object value);

	Object get(String key);

	<T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}

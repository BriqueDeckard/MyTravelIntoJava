package abstract_document.contracts;

import abstract_document.contracts.MyDocumentContract;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class MyAbstractDocument implements MyDocumentContract {
	private final Map<String, Object> properties;

	public MyAbstractDocument(Map<String, Object> properties) {
		Objects.requireNonNull(properties, "properties map is required");
		this.properties = properties;
	}

	@Override
	public void put(String key, Object value) {
		properties.put(key, value);
	}

	@Override
	public Object get(String key) {
		return properties.get(key);
	}

	@Override
	public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {

		return Stream
				// Returns a sequential Stream containing a single element, if non-null, otherwise returns an empty Stream.
				.ofNullable(get(key))
				.filter(Objects::nonNull)
				.map(element -> (List<Map<String, Object>>) element)
				// Returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.
				.findAny()
				.stream()
				.flatMap(Collection::stream)
				.map(constructor);
	}
}

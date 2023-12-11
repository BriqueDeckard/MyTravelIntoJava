package abstract_document;

import java.util.Optional;

public interface HasPriceContract extends MyDocumentContract {
	default Optional<String> getPrice() {
		return Optional.ofNullable(String.valueOf(get(MyProperty.PRICE.toString())));
	}
}

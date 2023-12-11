package structural.abstract_document.contracts;

import structural.abstract_document.domain.MyProperty;
import java.util.Optional;

public interface HasPriceContract extends MyDocumentContract {
	default Optional<String> getPrice() {
		return Optional.ofNullable(String.valueOf(get(MyProperty.PRICE.toString())));
	}
}

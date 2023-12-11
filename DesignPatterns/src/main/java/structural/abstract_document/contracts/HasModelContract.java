package structural.abstract_document.contracts;

import structural.abstract_document.domain.MyProperty;
import java.util.Optional;

public interface HasModelContract extends MyDocumentContract {
	default Optional<String> getModel() {
		return Optional.ofNullable((String) get(MyProperty.MODEL.toString()));
	}
}

package abstract_document.contracts;

import abstract_document.domain.MyProperty;
import java.util.Optional;

public interface HasModelContract extends MyDocumentContract {
	default Optional<String> getModel() {
		return Optional.ofNullable((String) get(MyProperty.MODEL.toString()));
	}
}

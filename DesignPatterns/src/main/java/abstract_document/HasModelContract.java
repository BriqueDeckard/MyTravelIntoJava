package abstract_document;

import java.util.Optional;

public interface HasModelContract extends MyDocumentContract {
	default Optional<String> getModel() {
		return Optional.ofNullable((String) get(MyProperty.MODEL.toString()));
	}
}

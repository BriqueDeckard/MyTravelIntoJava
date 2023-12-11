package abstract_document;

import java.util.Optional;

public interface HasPartsContract extends MyDocumentContract {
	default Optional<String> getParts(){
		return Optional.ofNullable((String) get(MyProperty.PARTS.toString()));
	}
}

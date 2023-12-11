package abstract_document.contracts;

import abstract_document.domain.MyProperty;
import java.util.Optional;

public interface HasTypeContract extends MyDocumentContract{
	default Optional<String> getType(){
		return Optional.ofNullable((String) get(MyProperty.TYPE.toString()));
	}
}

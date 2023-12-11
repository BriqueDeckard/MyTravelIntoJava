package abstract_document.contracts;

import abstract_document.domain.MyPart;
import abstract_document.domain.MyProperty;
import java.util.stream.Stream;

public interface HasPartsContract extends MyDocumentContract {
	default Stream<MyPart> getParts() {
		return children(MyProperty.PARTS.toString(), MyPart::new);
	}
}

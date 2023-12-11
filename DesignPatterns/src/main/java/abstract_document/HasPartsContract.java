package abstract_document;

import java.util.stream.Stream;

public interface HasPartsContract extends MyDocumentContract {
	default Stream<MyPart> getParts() {
		return children(MyProperty.PARTS.toString(), MyPart::new);
	}
}

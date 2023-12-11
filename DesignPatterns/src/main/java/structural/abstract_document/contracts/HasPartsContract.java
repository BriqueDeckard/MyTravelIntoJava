package structural.abstract_document.contracts;

import structural.abstract_document.domain.MyPart;
import structural.abstract_document.domain.MyProperty;
import java.util.stream.Stream;

public interface HasPartsContract extends MyDocumentContract {
	default Stream<MyPart> getParts() {
		return children(MyProperty.PARTS.toString(), MyPart::new);
	}
}

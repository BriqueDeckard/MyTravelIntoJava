package abstract_document.domain;

import abstract_document.contracts.*;
import java.util.Map;

public class MyConcreteDocument extends MyAbstractDocument implements
		HasModelContract,
		HasPartsContract,
		HasPriceContract,
		HasTypeContract {
	public MyConcreteDocument(Map<String, Object> properties) {
		super(properties);
	}
}

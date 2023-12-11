package abstract_document.domain;

import abstract_document.contracts.*;
import java.util.Map;

public class MyPart extends MyAbstractDocument implements HasModelContract, HasPartsContract,
		HasPriceContract, HasTypeContract {

	public MyPart(Map<String, Object> properties) {
		super(properties);
	}
}

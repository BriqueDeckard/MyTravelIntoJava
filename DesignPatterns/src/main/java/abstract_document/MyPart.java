package abstract_document;

import java.util.Map;

public class MyPart extends MyAbstractDocument implements HasModelContract, HasPartsContract,
		HasPriceContract, HasTypeContract {

	public MyPart(Map<String, Object> properties) {
		super(properties);
	}
}

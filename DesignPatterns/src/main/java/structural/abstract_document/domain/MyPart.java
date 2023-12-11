package structural.abstract_document.domain;

import java.util.Map;
import structural.abstract_document.contracts.*;

public class MyPart extends MyAbstractDocument implements HasModelContract, HasPartsContract,
		HasPriceContract, HasTypeContract {

	public MyPart(Map<String, Object> properties) {
		super(properties);
	}
}

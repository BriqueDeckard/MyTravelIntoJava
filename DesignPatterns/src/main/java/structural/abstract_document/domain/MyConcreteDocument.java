package structural.abstract_document.domain;


import java.util.Map;
import structural.abstract_document.contracts.*;

public class MyConcreteDocument extends MyAbstractDocument implements
		HasModelContract,
		HasPartsContract,
		HasPriceContract,
		HasTypeContract {
	public MyConcreteDocument(Map<String, Object> properties) {
		super(properties);
	}
}

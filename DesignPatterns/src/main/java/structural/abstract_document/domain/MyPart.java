package structural.abstract_document.domain;

import abstract_document.contracts.*;
import java.util.Map;
import java_design_patterns.abstract_document.contracts.*;
import structural.abstract_document.contracts.*;

public class MyPart extends MyAbstractDocument implements HasModelContract, HasPartsContract,
		HasPriceContract, HasTypeContract {

	public MyPart(Map<String, Object> properties) {
		super(properties);
	}
}

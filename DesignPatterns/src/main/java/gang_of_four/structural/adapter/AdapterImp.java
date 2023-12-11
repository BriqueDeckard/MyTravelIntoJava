package gang_of_four.structural.adapter;

public class AdapterImp implements TargetContract, AnotherTargetContract {
	private LegacyDomainClass legacyDomainClass = new LegacyDomainClass(42);

	public AdapterImp(LegacyDomainClass legacyDomainClass) {
		this.legacyDomainClass = legacyDomainClass;
	}

	@Override
	public void printLegacyFieldHashtaged() {
		System.out.println("#" + legacyDomainClass.getLegacyField() + "#");
	}

	@Override
	public void printLegacyFieldQuoted() {
		System.out.println("'" + legacyDomainClass.getLegacyField() + "'");
	}
}

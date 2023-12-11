package gang_of_four.structural.adapter;

public class LegacyDomainClass {
	int legacyField;

	public LegacyDomainClass(int legacyField) {
		this.legacyField = legacyField;
	}

	public int getLegacyField() {
		return legacyField;
	}

	public void setLegacyField(int legacyField) {
		this.legacyField = legacyField;
	}

	@Override
	public String toString() {
		return "LegacyDomainClass{" +
				"legacyField=" + legacyField +
				'}';
	}
}

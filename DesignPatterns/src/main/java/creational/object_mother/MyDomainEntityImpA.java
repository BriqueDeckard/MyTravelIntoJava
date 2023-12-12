package creational.object_mother;

public class MyDomainEntityImpA {
	private String fieldA;
	private String fieldB;
	private String fieldC;

	public MyDomainEntityImpA(String fieldA, String fieldB, String fieldC) {
		this.fieldA = fieldA;
		this.fieldB = fieldB;
		this.fieldC = fieldC;
	}

	public String getFieldA() {
		return fieldA;
	}

	public void setFieldA(String fieldA) {
		this.fieldA = fieldA;
	}

	public String getFieldB() {
		return fieldB;
	}

	public void setFieldB(String fieldB) {
		this.fieldB = fieldB;
	}

	public String getFieldC() {
		return fieldC;
	}

	public void setFieldC(String fieldC) {
		this.fieldC = fieldC;
	}

	@Override
	public String toString() {
		return "MyDomainEntityImpA{" +
				"fieldA='" + fieldA + '\'' +
				", fieldB='" + fieldB + '\'' +
				", fieldC='" + fieldC + '\'' +
				'}';
	}
}

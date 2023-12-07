package creational.builder.my_imp.domain;

public class MyComplexEntity {

	private String name;
	private String key;
	private String brand;
	private int code;

	@Override
	public String toString() {
		return "MyComplexEntity{" +
				"name='" + name + '\'' +
				", key='" + key + '\'' +
				", brand='" + brand + '\'' +
				", code=" + code +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}

package creational.context_object;

public class MyServiceContext {

	String AIM_A_SERVICE, AIM_B_SERVICE, AIM_C_SERVICE;

	public void setAIM_A_SERVICE(String AIM_A_SERVICE) {
		this.AIM_A_SERVICE = AIM_A_SERVICE;
	}

	public void setAIM_B_SERVICE(String AIM_B_SERVICE) {
		this.AIM_B_SERVICE = AIM_B_SERVICE;
	}

	public void setAIM_C_SERVICE(String AIM_C_SERVICE) {
		this.AIM_C_SERVICE = AIM_C_SERVICE;
	}

	public String getAIM_A_SERVICE() {
		return AIM_A_SERVICE;
	}

	public String getAIM_B_SERVICE() {
		return AIM_B_SERVICE;
	}

	public String getAIM_C_SERVICE() {
		return AIM_C_SERVICE;
	}

	@Override
	public String toString() {
		return "MyServiceContext{" +
				"AIM_A_SERVICE='" + AIM_A_SERVICE + '\'' +
				", AIM_B_SERVICE='" + AIM_B_SERVICE + '\'' +
				", AIM_C_SERVICE='" + AIM_C_SERVICE + '\'' +
				'}';
	}
}

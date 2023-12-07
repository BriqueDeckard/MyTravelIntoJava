package interfaces.example;

public interface Electronic {
	// Constant var
	String LED = "LED";

	// Static method
	static boolean isEnergyEfficient(String electronicType) {
		return electronicType.equals(LED);
	}

	// Abstract method
	@SuppressWarnings("SameReturnValue")
	int getElectricityInUse();

	// Default method
	default void printDescription() {
		System.out.println("Description");
	}
}

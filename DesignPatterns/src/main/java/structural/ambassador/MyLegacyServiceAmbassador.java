package structural.ambassador;

public class MyLegacyServiceAmbassador implements MyLegacyServiceContract {

	MyLegacyServiceContract myLegacyServiceContract;

	public MyLegacyServiceAmbassador() {
		myLegacyServiceContract = MyLegacyServiceImpl.getLegacyService();
	}

	@Override
	public Long doRemoteFunction(int value) throws Exception {
		return doSafeCall(value);
	}

	private Long doSafeCall(int value) {
		doGuard(value);
		try {
			return myLegacyServiceContract.doRemoteFunction(value);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return -1L;
		}
	}

	private void doGuard(int value) {
		if (value < 0) {
			throw new IllegalArgumentException();
		}
	}
}

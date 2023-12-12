package structural.ambassador;

import static java.lang.Thread.sleep;

public class MyLegacyServiceImpl implements MyLegacyServiceContract {

	private static MyLegacyServiceImpl service = null;

	static synchronized MyLegacyServiceImpl getLegacyService() {
		if (service == null) {
			service = new MyLegacyServiceImpl();
		}
		return service;
	}

	private MyLegacyServiceImpl() {
	}

	@Override
	public Long doRemoteFunction(int value) throws Exception {
		long waitTime = (long) Math.floor(Math.random() * 1000);

		try {
			sleep(waitTime);
		} catch (InterruptedException e) {
			System.err.println("Thread sleep interrupted. " + "\n" + e);
		}
		return waitTime >= 200 ? value * 10L : -1L;
	}
}

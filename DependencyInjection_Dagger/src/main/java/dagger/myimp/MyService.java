package dagger.myimp;

import javax.inject.Inject;

public class MyService {
	private final MyOtherService myOtherService;
	@Inject
	public MyService(MyOtherService myOtherService) {
		this.myOtherService = myOtherService;
	}

	public void doSomething() {
		System.out.println("Do something injected with dagger : " + myOtherService.getSomething());
	}
}

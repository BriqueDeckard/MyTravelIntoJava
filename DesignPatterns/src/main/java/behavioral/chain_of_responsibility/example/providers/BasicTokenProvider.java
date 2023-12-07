package behavioral.chain_of_responsibility.example.providers;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;

public class BasicTokenProvider extends AuthenticationProvider {
	@Override
	public void login(Subject subject, CallbackHandler handler) {
		System.out.println("LOGIN BASIC");
	}

	@Override
	public void logout() {
		System.out.println("LOGOUT BASIC");
	}

	@Override
	public void setCallbackHandler(CallbackHandler handler) {
		System.out.println("CALLBACK BASIC");
	}
}

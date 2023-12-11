package behavioral.gof.chain_of_responsibility.example.providers;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;

public class OAuthTokenProvider extends AuthenticationProvider {
	@Override
	public void login(Subject subject, CallbackHandler handler) {
		System.out.println("LOGIN OAUTH");
	}

	@Override
	public void logout() {
		System.out.println("LOGOUT OAUTH");
	}

	@Override
	public void setCallbackHandler(CallbackHandler handler) {
		System.out.println("CALLBACK OAUTH");
	}
}

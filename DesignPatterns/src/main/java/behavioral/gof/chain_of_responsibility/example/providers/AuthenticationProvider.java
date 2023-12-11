package behavioral.gof.chain_of_responsibility.example.providers;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;

public abstract class AuthenticationProvider {
	abstract void login(Subject subject, CallbackHandler handler);

	abstract void logout();

	abstract void setCallbackHandler(CallbackHandler handler);
}

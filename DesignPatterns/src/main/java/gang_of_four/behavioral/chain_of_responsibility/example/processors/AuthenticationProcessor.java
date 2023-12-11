package gang_of_four.behavioral.chain_of_responsibility.example.processors;


import gang_of_four.behavioral.chain_of_responsibility.example.providers.AuthenticationProvider;

public abstract class AuthenticationProcessor {
	public AuthenticationProcessor nextProcessor;

	public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}

	public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}
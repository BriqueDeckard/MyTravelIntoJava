package gang_of_four.behavioral.chain_of_responsibility.example.processors;


import gang_of_four.behavioral.chain_of_responsibility.example.providers.AuthenticationProvider;
import gang_of_four.behavioral.chain_of_responsibility.example.providers.BasicTokenProvider;

public class BasicTokenProcessor extends AuthenticationProcessor {
	public BasicTokenProcessor(AuthenticationProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public boolean isAuthorized(AuthenticationProvider authProvider) {
		if (authProvider instanceof BasicTokenProvider) {
			return true;
		} else if (nextProcessor != null) {
			return nextProcessor.isAuthorized(authProvider);
		}
		return false;
	}
}
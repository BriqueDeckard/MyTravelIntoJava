package behavioral.chain_of_responsibility.example.processors;


import behavioral.chain_of_responsibility.example.providers.AuthenticationProvider;
import behavioral.chain_of_responsibility.example.providers.OAuthTokenProvider;

public class OAuthTokenProcessor extends AuthenticationProcessor {
	public OAuthTokenProcessor(AuthenticationProcessor nextProcessor) {
		super(nextProcessor);
	}

	@Override
	public boolean isAuthorized(AuthenticationProvider authProvider) {
		if (authProvider instanceof OAuthTokenProvider) {
			return true;
		} else if (nextProcessor != null) {
			return nextProcessor.isAuthorized(authProvider);
		}
		return false;
	}
}

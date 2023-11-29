package design_patterns.chain_of_responsibility;

import design_patterns.chain_of_responsibility.example.processors.BasicTokenProcessor;
import design_patterns.chain_of_responsibility.example.processors.OAuthTokenProcessor;
import design_patterns.chain_of_responsibility.example.providers.BasicTokenProvider;
import design_patterns.chain_of_responsibility.example.providers.OAuthTokenProvider;
import design_patterns.chain_of_responsibility.my_imp.MyConcreteCoRElement1;
import design_patterns.chain_of_responsibility.my_imp.MyConcreteCoRElement2;
import design_patterns.chain_of_responsibility.my_imp.domain.MyConcreteElementToProcess1;
import design_patterns.chain_of_responsibility.my_imp.domain.MyConcreteElementToProcess2;

public class ChainOfResponsibilityApp {
	public static void main(String[] args) {
		MyConcreteCoRElement1 myConcreteCoRElement1 = new MyConcreteCoRElement1();
		MyConcreteCoRElement2 myConcreteCoRElement2 = new MyConcreteCoRElement2(myConcreteCoRElement1);
		MyConcreteElementToProcess1 myConcreteElementToProcess1 = new MyConcreteElementToProcess1();
		myConcreteCoRElement1.isProcessed(myConcreteElementToProcess1);
		myConcreteCoRElement2.isProcessed(myConcreteElementToProcess1);
		MyConcreteElementToProcess2 myConcreteElementToProcess2 = new MyConcreteElementToProcess2();
		myConcreteCoRElement1.isProcessed(myConcreteElementToProcess2);
		myConcreteCoRElement2.isProcessed(myConcreteElementToProcess2);

		example();
	}

	private static void example() {
		OAuthTokenProcessor oAuthTokenProcessor = new OAuthTokenProcessor(null);
		BasicTokenProcessor basicTokenProcessor = new BasicTokenProcessor(oAuthTokenProcessor);
		System.out.println("Oauth with oAuth: " + oAuthTokenProcessor.isAuthorized(new OAuthTokenProvider()));
		System.out.println("Oauth with basic: " + oAuthTokenProcessor.isAuthorized(new BasicTokenProvider()));
		System.out.println("Basic with oAuth: " + basicTokenProcessor.isAuthorized(new OAuthTokenProvider()));
		System.out.println("Basic with basic: " + basicTokenProcessor.isAuthorized(new BasicTokenProvider()));
	}
}

package edu.deq4.SpringSecurity.service;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class LoginService {

    private final OAuth2AuthorizedClientService authorizedClientService;

    public LoginService(OAuth2AuthorizedClientService authorizedClientService) {
        this.authorizedClientService = authorizedClientService;
    }

    public StringBuilder getUsernamePasswordLoginInfo(Principal user) {
        StringBuilder sb = new StringBuilder();
        System.out.println(user.toString());
        OAuth2AuthenticationToken token = (OAuth2AuthenticationToken) user;
        if (token.isAuthenticated()) {
            DefaultOAuth2User principal = (DefaultOAuth2User) token.getPrincipal();
            if (principal != null) {
                sb.append("Welcome, ").append(principal.getName());
            }
            getOauth2LoginInfo(principal);
        } else {
            sb.append("You are not authenticated");
        }
        return sb;
    }

    public StringBuilder getOauth2LoginInfo(DefaultOAuth2User user) {
        StringBuilder sb = new StringBuilder();
        user.getAttributes().entrySet().stream()
                .forEach(e -> {
                    String key = e.getKey();
                    Object value = e.getValue();
                    System.out.println(key + ": " + value);
                });
        return sb;
    }

    public StringBuilder getOauth2LoginInfo(Principal user) {
        StringBuilder sb = new StringBuilder();
        OAuth2AuthenticationToken token = (OAuth2AuthenticationToken) user;
        String authorizedClientRegistrationId = token.getAuthorizedClientRegistrationId();
        String name = token.getName();
        OAuth2AuthorizedClient auth2AuthorizedClient = this.authorizedClientService.loadAuthorizedClient(authorizedClientRegistrationId, name);
        return sb;
    }
}

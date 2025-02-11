package edu.deq4.SpringSecurity.app.web.rest.controller;

import edu.deq4.SpringSecurity.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MyRestController {

    private final LoginService loginService;


    public MyRestController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/user")
    String getUser() {
        return "user";
    }

    @GetMapping("/admin")
    String getAdmin() {
        return "admin";
    }

    /**
     * GitHub for
     * 32421519
     * >OAuth2AuthenticationToken [
     * Principal=Name: [32421519],
     * Granted Authorities: [
     * [OAUTH2_USER, SCOPE_read:user]
     * ],
     * User Attributes: [
     * {
     * login=BriqueDeckard,
     * id=32421519,
     * node_id=MDQ6VXNlcjMyNDIxNTE5,
     * avatar_url=https://avatars.githubusercontent.com/u/32421519?v=4,
     * gravatar_id=,
     * url=https://api.github.com/users/BriqueDeckard,
     * html_url=https://github.com/BriqueDeckard,
     * followers_url=https://api.github.com/users/BriqueDeckard/followers,
     * following_url=https://api.github.com/users/BriqueDeckard/following{/other_user},
     * gists_url=https://api.github.com/users/BriqueDeckard/gists{/gist_id},
     * starred_url=https://api.github.com/users/BriqueDeckard/starred{/owner}{/repo},
     * subscriptions_url=https://api.github.com/users/BriqueDeckard/subscriptions,
     * organizations_url=https://api.github.com/users/BriqueDeckard/orgs,
     * repos_url=https://api.github.com/users/BriqueDeckard/repos,
     * events_url=https://api.github.com/users/BriqueDeckard/events{/privacy},
     * received_events_url=https://api.github.com/users/BriqueDeckard/received_events,
     * type=User,
     * user_view_type=private,
     * site_admin=false,
     * name=DeQard,
     * company=null,
     * blog=,
     * location=France,
     * email=null,
     * hireable=null,
     * bio="The very shape of a seemingly insignificant tool could have almost endless repercussions." [ Junichiro Tanizaki - In Praise of Shadows ],
     * twitter_username=null,
     * notification_email=null,
     * public_repos=19,
     * public_gists=0,
     * followers=2,
     * following=29,
     * created_at=2017-09-30T20:07:03Z,
     * updated_at=2025-02-10T10:12:57Z,
     * private_gists=0,
     * total_private_repos=7,
     * owned_private_repos=7,
     * disk_usage=151524,
     * collaborators=0,
     * two_factor_authentication=true,
     * plan={
     * name=free,
     * space=976562499,
     * collaborators=0,
     * private_repos=10000
     * }
     * }
     * ],
     * Credentials=[PROTECTED],
     * Authenticated=true,
     * Details=WebAuthenticationDetails [
     * RemoteIpAddress=0:0:0:0:0:0:0:1,
     * SessionId=14E82793BA73784BB78A4B6FAB6F1B89
     * ],
     * Granted Authorities=[
     * OAUTH2_USER,
     * SCOPE_read:user
     * ]
     * ]
     *
     * @param user
     * @return
     */
    // @GetMapping("/") // TODO simple login
    public String getGitHub(Principal user) {
        return "GitHub for <br/>" + user.getName() + "<br/>>" + user.toString();
    }

    @GetMapping("/*")
    public String getUserInfo(Principal user) {
        StringBuilder userInfo = loginService.getUsernamePasswordLoginInfo(user);
        return userInfo.toString();
    }
}

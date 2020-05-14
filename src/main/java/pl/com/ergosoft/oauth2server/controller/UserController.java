package pl.com.ergosoft.oauth2server.controller;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@EnableResourceServer
public class UserController {


    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

}

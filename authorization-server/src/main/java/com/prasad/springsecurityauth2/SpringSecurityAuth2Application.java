package com.prasad.springsecurityauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class SpringSecurityAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityAuth2Application.class, args);
    }

}

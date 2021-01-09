package io.artfx.auth.controller;

import io.artfx.auth.view.AuthenticationView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AuthController {

    @PostMapping("/uaa")
    public boolean authenticate(@RequestBody AuthenticationView authenticationView) {
        log.info("Authentication Username: {}", authenticationView.getUsername());
        return true;
    }

    @GetMapping("/token")
    public String getToken() {
        return "";
    }
}

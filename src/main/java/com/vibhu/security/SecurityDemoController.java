package com.vibhu.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {

    @GetMapping("/security-demo")
    public String securityDemo() {
        return "Security Demo Endpoint";

    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";

    }

    @GetMapping("/user")
    public String user() {
        return "user";

    }

    @GetMapping("/home")
    public String home() {
        return "home";

    }
}



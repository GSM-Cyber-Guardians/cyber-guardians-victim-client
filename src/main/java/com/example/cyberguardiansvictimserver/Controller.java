package com.example.cyberguardiansvictimserver;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody LoginRequest request) {
        System.out.println("ID: " + request.getId() + ", Password: " + request.getPassword());
        return "로그인 되었습니다!";
    }

    @GetMapping("/ping")
    @ResponseBody
    public String ping() {
        return "Pong!";
    }

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @Data
    public static class LoginRequest {
        private String id;
        private String password;
    }
}

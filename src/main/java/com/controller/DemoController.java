package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/")
public class DemoController {

    @GetMapping("/protected")
    public String helloSecure() {
        return "Hello Ben protected";
    }

    @GetMapping("/public")
    public String helloPublic() {
        return "Hello Ben public";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello user";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello admin";
    }
}

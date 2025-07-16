package com.swamantra.Ims;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/api")
public class HelloController {
    @GetMapping("/")
    public String sayHello() {
        System.out.println("Hello, World! from HelloController");
        return "Hello, World!";

    }
}

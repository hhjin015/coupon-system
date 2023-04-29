package com.github.hhjin015.coupons;

import com.github.hhjin015.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private HelloService service;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}

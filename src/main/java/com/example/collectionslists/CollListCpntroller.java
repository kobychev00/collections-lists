package com.example.collectionslists;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollListCpntroller {
    @GetMapping("/")
    public String hello() {
        return "hello";
    } @GetMapping("/1")
    public String one() {
        return "one";
    }
}

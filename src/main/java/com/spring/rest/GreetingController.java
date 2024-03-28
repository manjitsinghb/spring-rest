package com.spring.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/getGreeting")
    public ResponseEntity<String> getGreeting(){
        return ResponseEntity.ok("Hello");
    }
}

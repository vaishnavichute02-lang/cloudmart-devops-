package com.cloudmart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudMartController {

    @GetMapping("/")
    public String home() {
        return "CloudMart DevOps Application is Running Successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
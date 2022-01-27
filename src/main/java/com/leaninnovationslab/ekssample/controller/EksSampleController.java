package com.leaninnovationslab.ekssample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EksSampleController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "Demo Branch: Hello from the server, deploying a new version V11";
    }
}

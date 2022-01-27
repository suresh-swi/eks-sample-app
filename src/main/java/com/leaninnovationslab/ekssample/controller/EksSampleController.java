package com.leaninnovationslab.ekssample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EksSampleController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "Hello from the server, this was deployed using code build and this is V2 Version";
    }
}

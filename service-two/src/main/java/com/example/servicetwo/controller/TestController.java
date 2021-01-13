package com.example.servicetwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ServiceOneFeignClient serviceOneFeignClient;

    @RequestMapping("/call")
    public String call() {
        String result = serviceOneFeignClient.hello();
        return "Server B call Server A : " + result;
    }
}

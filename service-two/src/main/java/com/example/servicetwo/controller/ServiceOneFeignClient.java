package com.example.servicetwo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE-ONE")
public interface ServiceOneFeignClient {
    @RequestMapping("/hello")
    public String hello();
}

package com.yu.hearttoheart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {


    @GetMapping("/test")
    public String Test(){
        return "1";
    }
}

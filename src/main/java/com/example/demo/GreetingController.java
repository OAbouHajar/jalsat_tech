package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @RequestMapping("/img")
    public @ResponseBody String img() {
        String returnedValue = "<img src='img/download.png'/>";
        return returnedValue;
    }

}
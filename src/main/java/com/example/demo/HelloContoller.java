package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class HelloContoller {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        LocalDateTime dataTime =  LocalDateTime.now();
        String st  = dataTime.toString();

        String returnedValue = "Hello From my App " + "<br>" + st + "<br>" + "<p style=\"color:red;\">I am red</p>\n";
        return returnedValue;
    }
}
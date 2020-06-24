package com.spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by dhokim on 2020-06-24
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String main(){
        System.out.println("Connect Main Controller : /");
        return "Greetings from Spring Boot!";
    }
}

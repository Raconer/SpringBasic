package com.spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by dhokim on 2020-06-24
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        System.out.println("Connect Main Controller : /");
        return "/WEB-INF/main.jsp";
    }

}

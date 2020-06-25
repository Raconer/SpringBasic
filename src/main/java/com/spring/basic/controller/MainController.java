package com.spring.basic.controller;

import com.spring.basic.model.user.User;
import com.spring.basic.repository.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dhokim on 2020-06-24
 */

@Controller
public class MainController {

    private UserMapper userMapper;

    @GetMapping("/")
    public String home(){
        System.out.println("Connect Main Controller : /");
        return "/WEB-INF/main.jsp";
    }

    @PostMapping("/user/add")
    @ResponseBody
    public String addNewUser(@RequestParam String name, @RequestParam String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userMapper.save(user);

        return "Saved";
    }

    @PostMapping("/all")
    @ResponseBody
    public Iterable<User> getAllUser(){
        return userMapper.findAll();
    }
}

package com.spring.basic.controller;

import java.util.List;

import com.spring.basic.mapper.StudyMapper;
import com.spring.basic.model.Study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by dhokim on 2020-06-24
 */

@Controller
public class MainController {

    private StudyMapper studyMapper;

    public MainController(StudyMapper studyMapper){
        this.studyMapper = studyMapper;
    }

    @GetMapping("/")
    public String home(){
        System.out.println("Connect Main Controller : /");
        List<Study> studies = studyMapper.findAll();
        System.out.println("Study List Count : " + studies.size());
        return "main";
    }

}

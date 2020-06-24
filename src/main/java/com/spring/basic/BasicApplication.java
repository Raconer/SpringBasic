package com.spring.basic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by dhokim on 2020-06-24
 */


@SpringBootApplication
public class BasicApplication extends SpringBootServletInitializer {
    public static void main(String[] args){
        SpringApplicationBuilder builder = new SpringApplicationBuilder(BasicApplication.class);
        builder.run(args);
    }
}

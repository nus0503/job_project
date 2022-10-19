package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger("LoggerController 의 로그");

    @RequestMapping("/")
    public String index() {



        return "index";
    }
    @RequestMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/og")
    public void log() {
        logger.info("로깅 발생sdsdd!");
    }
}

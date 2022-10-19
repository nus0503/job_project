package com.example.demo.controller;

import com.example.demo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {


    @Autowired
    private LogService logService;

    @GetMapping("/log")
    public void log() {
        logService.log();
    }
}

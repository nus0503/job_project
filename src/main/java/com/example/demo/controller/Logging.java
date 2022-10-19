package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logging {

    public static void main(String[] args) {
        log.debug("Logging - Debug log");
        log.info("Logging - Info log");
        log.warn("Logging - Warn log");
        log.error("Logging - Error log");
    }
}

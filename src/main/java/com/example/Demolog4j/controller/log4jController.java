package com.example.Demolog4j.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class log4jController {

    private static final Logger log = Logger.getLogger(log4jController.class);

    @RequestMapping("")
    public  String index(){
        log.trace("This is TRACE");
        log.debug("This is DEBUG");
        log.info("This is INFO");
        log.warn("This is WARN");
        log.error("This is ERROR");
        log.fatal("This is FATAL");


        return "welcome to log4j";
    }
}

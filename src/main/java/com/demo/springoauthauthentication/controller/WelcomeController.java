package com.demo.springoauthauthentication.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class WelcomeController {

    private final Logger LOG = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping()
    public String getWelcomeMessage(){
        LOG.info("Method Called successfully");
        return "Hello, Successfully Authenticated With Google Authentication";
    }

}

package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "hello jenkins";
    }
}

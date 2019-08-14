package com.pearl.data.controller;

import com.pearl.data.service.BugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugController {

    @Autowired
    BugService bugService;

    @GetMapping("/list")
    public String listBug(){

        return bugService.findAll();
    }
}

package com.qawebapp.qawebapplication.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageControl {

    @RequestMapping("/homepage")
    public String homePage(){
        return "Homepage.html";
    }


}

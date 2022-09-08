package com.example.thirdapp.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
public class CourseContoller {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/service")
    public String service(){
        return "service";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
}

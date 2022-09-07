package com.example.secondapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.secondapp.entity.Course;
import com.example.secondapp.services.CourseServiceImpl;

@RestController
@Component
public class CourseController {
    @Autowired
    public CourseServiceImpl courseService;
    @GetMapping("/")
    public String home(){
        return "This is Home Page";
    }
    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getCourse();
    }
    
}

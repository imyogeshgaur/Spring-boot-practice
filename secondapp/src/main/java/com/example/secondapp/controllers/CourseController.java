package com.example.secondapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @PostMapping("/courses")
    public Course setCourse(@RequestBody Course c){
        return this.courseService.setCourse(c);
    }
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course c){
        return this.courseService.updateCourse(c);
    }
    @RequestMapping(value={"/course"},method = {RequestMethod.DELETE})
    public ResponseEntity<HttpStatus> deleteCourse(@RequestBody Course c){
         try {
            this.courseService.deleteCourse(c);
            return new ResponseEntity<>(HttpStatus.OK);
         } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
    }
    
}

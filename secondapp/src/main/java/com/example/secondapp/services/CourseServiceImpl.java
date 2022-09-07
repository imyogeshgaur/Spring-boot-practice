package com.example.secondapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.secondapp.entity.Course;

@Service
@Component
public class CourseServiceImpl implements CourseService{
    List<Course> list;

    public List<Course> getCourse(){
        list  = new ArrayList<>();
        list.add(new Course(101, "Java", "I Love Java"));
        list.add(new Course(102, "JavaScript", "I Love JavaScript"));
        return list;
    }
}

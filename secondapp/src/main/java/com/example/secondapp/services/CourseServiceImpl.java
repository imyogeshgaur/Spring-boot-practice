package com.example.secondapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.secondapp.entity.Course;

@Service
@Component
public class CourseServiceImpl implements CourseService{
    List<Course> list = new ArrayList<>();
    @Override
    public List<Course> getCourse(){
        return list;
    }
    @Override
    public Course setCourse(Course c){
        list.add(new Course(c.couresId,c.courseName,c.courseDesc));
        return c;
    }
    @Override
    public Course updateCourse(Course c){
        list.forEach(e->{
            if(e.getCouresId() == c.getCouresId()){
                e.setCourseName(c.getCourseName());
                e.setCourseDesc(c.getCourseDesc());
            }
        });
        return c;
    }
    @Override
    public String deleteCourse(Course c){
        list.forEach(e->{
            if(e.getCouresId() == c.getCouresId()){
                list.remove(c);
            }
        });
        return "Course With Id "+c.couresId+" is deleted";
    }
}

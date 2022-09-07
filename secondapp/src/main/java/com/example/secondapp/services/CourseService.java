package com.example.secondapp.services;

import java.util.List;

import com.example.secondapp.entity.Course;

public interface CourseService {
    public List<Course> getCourse();
    public Course setCourse(Course course);
    public Course updateCourse(Course course);
    public String deleteCourse(Course course);
}

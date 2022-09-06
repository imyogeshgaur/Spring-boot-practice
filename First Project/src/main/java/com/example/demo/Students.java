package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Students {
    private String name;
    private String email;
    private int RollNo;
    @Autowired
    @Qualifier("school")
    private School school;
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String showSchool(){
        school.setSchoolName("Kendriya Vidyalaya");
        String schoolOfStudent = school.getSchoolName();
        return schoolOfStudent;
    }
}

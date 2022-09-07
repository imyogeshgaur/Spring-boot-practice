package com.example.secondapp.entity;

public class Course {
    public long couresId;
    public String courseName;
    public String courseDesc;

    public Course(long cid,String cname,String cdesc){
        super();
        this.couresId = cid;
        this.courseName = cname;
        this.courseDesc = cdesc;
    }
}

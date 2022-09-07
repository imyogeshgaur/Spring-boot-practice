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
    public long getCouresId() {
        return couresId;
    }
    public void setCouresId(long couresId) {
        this.couresId = couresId;
    }
    public String getCourseDesc() {
        return courseDesc;
    }
    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

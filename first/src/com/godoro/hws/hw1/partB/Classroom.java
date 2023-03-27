package com.godoro.hws.hw1.partB;

import java.util.List;

public class Classroom {
    private long classroomId;
    private String classroomName;
    private School school;
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public Classroom(){


    } 
    public Classroom(long classroomId, String classroomName) {
        this.classroomId = classroomId;
        this.classroomName = classroomName;
    }
    public long getClassroomId() {
        return classroomId;
    }
    public void setClassroomId(long classroomId) {
        this.classroomId = classroomId;
    }
    public String getClassroomName() {
        return classroomName;
    }
    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }
    public School getSchool() {
        return school;
    }
    public void setSchool(School school) {
        this.school = school;
    }
    
    
}

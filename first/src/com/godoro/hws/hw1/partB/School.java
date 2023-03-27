package com.godoro.hws.hw1.partB;

import java.util.List;

public class School {
    private long schoolId;
    private String schoolName;
    private List<Classroom> classroomList;

    public List<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    public School(){

    }

    public School(long schoolId, String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }
    public long getSchoolId() {
        return schoolId;
    }
    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    
}

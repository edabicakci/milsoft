package com.godoro.hws.hw1.partB;

public class Student {

    private long studentId;
    private String studentName;
    private double averageMark;
    private Classroom classroom;

    public Classroom getClassroom() {
        return classroom;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    public Student(){

    }
    public Student(long studentId, String studentName, double averageMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageMark = averageMark;
    }
    public long getStudentId() {
        return studentId;
    }
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    
    
}

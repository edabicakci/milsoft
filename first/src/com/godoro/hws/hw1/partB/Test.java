package com.godoro.hws.hw1.partB;

import java.util.ArrayList;

public class Test {

    public static void printStudentList(Classroom classroom){

        for (Student student : classroom.getStudentList()) {
            System.out.println("\t\t" + student.getStudentId() + " "
            + student.getStudentName() + " "
            + student.getAverageMark());      
        }
    }
    public static void main(String[] args) {
        School school = new School(901, "Godoro Üniversitesi");
        school.setClassroomList(new ArrayList<Classroom>());

        Classroom classroom1 = new Classroom(701, "Mühendislik");
        Classroom classroom2 = new Classroom(702, "Ekonomi");

        school.getClassroomList().add(classroom1);
        school.getClassroomList().add(classroom2);

        classroom1.setSchool(school);
        classroom2.setSchool(school);

        classroom1.setStudentList(new ArrayList<Student>());
        classroom2.setStudentList(new ArrayList<Student>());

        Student student1 = new Student(301, "Neşet Ertaş", 45.2);
        student1.setClassroom(classroom1);
        classroom1.getStudentList().add(student1);

        Student student2 = new Student(303, "Mahsuni Şerif", 36.5);
        student2.setClassroom(classroom1);
        classroom1.getStudentList().add(student2);

        Student student3 = new Student(304, "Celal Güzelses", 61.2);
        student3.setClassroom(classroom1);
        classroom1.getStudentList().add(student3);

        Student student4 = new Student(302, "Erkan Ocaklı", 71.3);
        student4.setClassroom(classroom2);
        classroom2.getStudentList().add(student4);

        Student student5 = new Student(305, "Mustafa Topaloğlu", 42.2);
        student5.setClassroom(classroom2);
        classroom2.getStudentList().add(student5);


        System.out.println(school.getSchoolId() + " " + school.getSchoolName());
        System.out.println("\t" + classroom1.getClassroomId() + " " + classroom1.getClassroomName());
        printStudentList(classroom1);
        System.out.println("\t" + classroom2.getClassroomId() + " " + classroom2.getClassroomName());
        printStudentList(classroom2);
    }
    
}

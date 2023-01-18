import course.Course;
import group.Group;
import student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("------Students------");
        student.setName("Bayel");
        student.setSurname("Abdibaitov");
        student.setAge(18);
        student.setEmailAdress("abdibaitov7777777@gmail.com");
        System.out.println("name: "+student.getName()+", surename: "+student.getSurname()+", age: "+student.getAge()+", emailadress: "+student.getEmailAdress());
        System.out.println();
        Student student2 = new Student();
        student2.setName("Babadin");
        student2.setSurname("Zaynabidinov");
        student2.setAge(16);
        student2.setEmailAdress("Babadin5555555@gmail.com");
        System.out.println("name: "+student2.getName()+", surename: "+student2.getSurname()+", age: "+student2.getAge()+", emailadress: "+student2.getEmailAdress());
        System.out.println();
        Student student3 = new Student();
        student3.setName("Umar");
        student3.setSurname("Topchuev");
        student3.setAge(13);
        student3.setEmailAdress("Umar1111111@gmail.com");
        System.out.println("name: "+student3.getName()+", surename: "+student3.getSurname()+", age: "+student3.getAge()+", emailadress: "+student3.getEmailAdress());
        System.out.println();
        Student student4 = new Student();
        student4.setName("Askhat");
        student4.setSurname("Sadirjanov");
        student4.setAge(10);
        student4.setEmailAdress("Askhat9999999@gmail.com");
        System.out.println("name: "+student4.getName()+", surename: "+student4.getSurname()+", age: "+student4.getAge()+", emailadress: "+student4.getEmailAdress());
        Group group = new Group();
        System.out.println("\n------Group------");

        group.setWhatGroupTeach("Programming of Java");
        group.setDataOfStartStudy("05 December");
        System.out.println("WhatGroupTeach: "+group.getWhatGroupTeach()+", DataOfStartStudy: "+group.getDataOfStartStudy());
        System.out.println("\nStudent who study in the first group Java 5.1:");
        group.setGroups(student,student2);
        System.out.println("\nStudent who study in the second group Java 5.2:");
        group.setGroups2(student,student2);

        System.out.println("\n------Course------");
        Course course = new Course();
        course.setNameOfCourse("PeakSoft");
        course.setNumberOfCourse("Java - 5 theory");
        course.setNameOfTeacher("Timurlan");
        System.out.println("NameOfCourse: "+course.getNameOfCourse()+", NumberOfCourse: "+course.getNumberOfCourse()+", NameOfTeacher: "+course.getNameOfTeacher());
        System.out.println();
        Course course2 = new Course();
        course2.setNameOfCourse("PeakSoft");
        course2.setNumberOfCourse("Java - 5 practice");
        course2.setNameOfTeacher("Meder");
        System.out.println("NameOfCourse: "+course2.getNameOfCourse()+", NumberOfCourse: "+course2.getNumberOfCourse()+", NameOfTeacher: "+course2.getNameOfTeacher());
        System.out.println("\nGroups that are in the course:");
        course2.setGroups(course,course2);



    }
}
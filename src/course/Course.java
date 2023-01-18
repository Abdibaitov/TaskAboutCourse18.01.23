package course;

import group.Group;
import student.Student;

public class Course {
    private String nameOfCourse;
    private String numberOfCourse;
    private String nameOfTeacher;
    Group[] groups;

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(String numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Course(String nameOfCourse, String numberOfCourse, String nameOfTeacher, Group[] groups) {
        this.nameOfCourse = nameOfCourse;
        this.numberOfCourse = numberOfCourse;
        this.nameOfTeacher = nameOfTeacher;
        this.groups = groups;
    }

    public  Course(){

    }

    public void setGroups(Course course, Course course2)
    {
        System.out.println("Java 5.1\n"+"Java 5.2");
    }
}

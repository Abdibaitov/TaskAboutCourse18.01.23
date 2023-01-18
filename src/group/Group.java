package group;

import course.Course;
import student.Student;

public class Group {
    private Student[] students;
    private String whatGroupTeach;
    private String dataOfStartStudy;


    public Student[] getStudents(Student[] students) {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getWhatGroupTeach() {
        return whatGroupTeach;
    }

    public void setWhatGroupTeach(String whatGroupTeach) {
        this.whatGroupTeach = whatGroupTeach;
    }

    public String getDataOfStartStudy() {
        return dataOfStartStudy;
    }

    public void setDataOfStartStudy(String dataOfStartStudy) {
        this.dataOfStartStudy = dataOfStartStudy;
    }

    public Group(Student[] students, String whatGroupTeach, String dataOfStartStudy) {
        this.students = students;
        this.whatGroupTeach = whatGroupTeach;
        this.dataOfStartStudy = dataOfStartStudy;
    }

    public Group(){

    }

    public void setGroups(Student student, Student student2)
    {
        System.out.println("Bayel\n"+"Babadin");

    }
    public void setGroups2(Student student,Student student2)
    {
        System.out.println("Umar\n"+"Askhat");

    }
}

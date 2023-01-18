package student;

public class Student {
    private int age;
    private String name;
    private String surname;
    private String emailAdress;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age != 0) {
            this.age = age;
        }
        else {
            System.out.println("Age is false");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public Student(int age, String name, String surname, String emailAdress) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.emailAdress = emailAdress;
    }
    public Student(){

    }

}

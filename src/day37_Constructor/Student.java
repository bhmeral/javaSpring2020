package day37_Constructor;

public class Student {

    String name;
    int age;
    char gender;
    String university;


    public Student(String name,int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }


    public void setInfo(String name,int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }

    public String toString(){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Gender: " + gender + "\n" + "University: " + university;
    }

}

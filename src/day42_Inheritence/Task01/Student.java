package day42_Inheritence.Task01;

public class Student extends Person{

    /*
    name
    age
    gender
    studentID
    class
     */

    public long studentID;
    public String clazz;
    public static String schoolName = "Cybertek";

    public void setStudentInfo(String name, int age,char gender,int studentID,String clazz){
        setPersonInfo(name,age,gender);
        this.studentID = studentID;
        this.clazz = clazz;

    }

    public String toString(){
        return "Name: " + name + " StudentID: " + studentID  + " Class: " + clazz + " Age: " + age + " Gender: " + gender + " SchoolName: " + schoolName;
    }

    public void code(){
        System.out.println(name + "is coding");
    }

}

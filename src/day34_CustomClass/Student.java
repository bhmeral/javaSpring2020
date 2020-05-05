package day34_CustomClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Student {
    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean married;

    public void setStudentInfo(String studentName,String studentNationality,int studentAge, double studentGPA, char studentGender,boolean studentMarriage){
        name=studentName;
        nationality=studentNationality;
        age=studentAge;
        gpa=studentGPA;
        gender=studentGender;
        married=studentMarriage;
    }

    public String toString(){
        return "Student Name: " + name + "\n" +
                "Student Nationality: " + nationality + "\n" +
                "Student Age: " + age + "\n" + "Student GPA: " + gpa + "\n" + "Student Gender: " +
                gender + "\n" + "Student Marriage Status: " + married;

    }

}

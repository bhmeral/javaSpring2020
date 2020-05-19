package day42_Inheritence.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Baha", 19, 'M', 4534, "Batch 18");
        student2.setStudentInfo("Bahtiyar", 35, 'M', 545, "Testing");
        student3.setStudentInfo("Byakl", 54, 'M', 546, "Soccer");


        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(student1, student2, student3));

        //  System.out.println(studentArrayList);

        for (Student each : studentArrayList) {
//            System.out.println(each);
            System.out.println("Name: " + each.name + ", ID: " + each.studentID);
        }

    }
}

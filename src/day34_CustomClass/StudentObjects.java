package day34_CustomClass;


import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentInfo("Baha", "Turkey", 19, 94, 'M', false);

        Student student2 = new Student();
        student2.setStudentInfo("Mike","German",30,3.0,'M',false);

        Student student3 = new Student();
        student3.setStudentInfo("Anna","Ukranie",33,3.9,'F',true);

        Student[] students = {student1,student2,student3};

     //   System.out.println(Arrays.toString(students));

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));
            canGraduate.removeIf(p -> p.gpa<=3);

     //   System.out.println(canGraduate.size()); size: 3

        for (int i=0; i<canGraduate.size(); i++){
          Student each = canGraduate.get(i);
            System.out.println(each.name + " can graduate.");
        }

        ArrayList<Student> cantGraduate = new ArrayList<>(Arrays.asList(students));
         cantGraduate.removeIf(p-> p.gpa>3);

         for (int i=0; i<cantGraduate.size(); i++){
             Student each = cantGraduate.get(i);
             System.out.println(each.name + " cant graduate.");
         }

    }
}

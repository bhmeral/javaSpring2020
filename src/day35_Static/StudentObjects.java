package day35_Static;

public class StudentObjects {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Baha",857689,4.4);
        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Muhtar",65648,3.4);
        System.out.println(student2);

        Student.printSchoolName();

    }

}

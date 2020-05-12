package day37_Constructor;

public class CybertekStudent {

    static String schoolName;
    String studentName;
    String groupName;
    String batch;

    public CybertekStudent(String studentName, String groupName, String batch) {
        schoolName = "Cybertek";
        this.studentName = studentName;
        this.groupName = groupName;
        this.batch = batch;
    }

    public String toString() {
        return "SchoolName: " + schoolName + "\n" + "StudentName: " + studentName + "\n" +
                "GroupName: " + groupName + "\n" + "Batch: " + batch;
    }


}


class CObjects {
    public static void main(String[] args) {
        CybertekStudent student1 = new CybertekStudent("Baha", "Online-1", "Batch 18");
        student1.schoolName = "MIT";
        System.out.println(student1);
        CybertekStudent student2 = new CybertekStudent("Sarah","Online-12","Batch 18");

        System.out.println(student2);
    }
}
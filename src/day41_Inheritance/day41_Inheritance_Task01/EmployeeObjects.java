package day41_Inheritance.day41_Inheritance_Task01;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer dev1 = new Developer(120000,"Namık",605,"Dev",'M');
        dev1.coding();
        dev1.fixingBug();
        System.out.println(dev1);
        Tester tester1 = new Tester("1",1,3,"2",'a');
        tester1.testing();
        tester1.reporting();
        System.out.println(tester1);
        BusinessAnalyst BA1 = new BusinessAnalyst("Ozgur",12345,431,'M');
        System.out.println(BA1);
        BA1.gathering();
        BA1.writingReq();



    }
}

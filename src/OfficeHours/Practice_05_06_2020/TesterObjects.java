package OfficeHours.Practice_05_06_2020;

public class TesterObjects {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setInfo("Baha","SDET",100000,9765834);
        System.out.println(tester1);

        System.out.println("=================================");

        Tester tester2 = new Tester();
        tester2.setInfo("Muhtar","SDET",100000,8765987);
        System.out.println(tester2);

        System.out.println("=================================");

        tester1.smokeTesting();
        tester2.smokeTesting();




    }



}

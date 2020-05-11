package day36_StaticBlock;

import day34_CustomClass.TestersForCompany;

public class StaticBlock4 {

    static String name = "Cybertek School";
    static TestersForCompany tester1 = new TestersForCompany();
    //tester1.setInfo("Muhtar",123,"SDET",120000);

    int insVariable;

    static {
        // gets executed as soon as the class is loaded
        // designed to initialize static variables
        name = "Cybertek School";
        tester1.setTesterInfo("Muhtar",123,"SDET",120000);

       // StaticBlock4 obj1 = new StaticBlock4();
               // obj1.insVariable = 300;
    }

    public static void main(String[] args) {
        System.out.println(name);

        System.out.println(tester1);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable);
    }


}


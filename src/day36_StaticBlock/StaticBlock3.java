package day36_StaticBlock;

import day34_CustomClass.TestersForCompany;

public class StaticBlock3 {

    static String name;
    static int num;

    static TestersForCompany tester1;

    /*
    public static void main(String[] args) {
        name = "Muhtar";
        num = 200;
    }
     */

    static {
        name = "Muhtar";
        num = 100;
        tester1 = new TestersForCompany();
        tester1.setTesterInfo("Ceko",123,"Dev",163540);

    }

}

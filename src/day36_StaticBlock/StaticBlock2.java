package day36_StaticBlock;

import day34_CustomClass.TestersForCompany;

public class StaticBlock2 {
    static int a;
    static int b;
    int c;
    /*
    if(100 > 200){
        a = 100;
    }else{
        b= 200;
    }
     */

    static TestersForCompany tester1 = new TestersForCompany();

    public static void main(String[] args) {
        System.out.println(tester1);
    }

    static{
        a=100;
        b=200;
        // c = 300; // static only accepts static
        if(100 > 200){
            a=100;
        }else{
            b=200;
        }
        tester1.setTesterInfo("Jean", 123, "SDET", 120000);
    }
}

package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

    static Developer dev1 = new Developer();

    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();

    /*
    public static void main(String[] args) {
        dev1.setInfo("Baha","Dev",140000,76520);
        dev1.setInfo("Keko","Dev",165000,76250);
        dev1.setInfo("Ceko","Dev",135000,76540);
    }
    */

    static {
        dev1.setInfo("Baha","Dev",140000,76520);
        dev2.setInfo("Keko","Dev",165000,76250);
        dev3.setInfo("Ceko","Dev",135000,76540);
    }


}

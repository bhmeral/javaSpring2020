package day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<TestersForCompany> testers = new ArrayList<>();

    public void hireTester(TestersForCompany tester){
        testers.add(tester);
    }
    public void fireTester(int employeeID){
        testers.removeIf(p->p.employeeID==employeeID);

    }



}


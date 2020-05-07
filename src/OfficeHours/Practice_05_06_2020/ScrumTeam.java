package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();


    public void hireTester(Tester tester){
            testers.add(tester);
    }

    public void fireTester(int ID){
            testers.removeIf( p -> p.employeeID==ID);
    }

    public void hireADeveloper(Developer developer){
        developers.add(developer);
    }
    public void  fireADeveloper(int ID){
        developers.removeIf(p-> p.employeeID==ID);
    }

}

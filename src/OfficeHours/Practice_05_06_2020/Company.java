package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
      Tester tester1 = new Tester();
      tester1.setInfo("Onur","Junior Tester",75000,54367);

      Tester tester2 = new Tester();
      tester2.setInfo("Elton","Junior Tester",75000,75987);

      Tester tester3 = new Tester();
      tester3.setInfo("Rahman","SDET",120000,875983);

      ScrumTeam scrum1 = new ScrumTeam(); // we can use the arraylists in scrumteam in
      scrum1.hireTester(tester1);
      scrum1.hireTester(tester3);
      scrum1.hireTester(tester2);

      scrum1.fireTester(54367);

      for ( Tester each : scrum1.testers){
          System.out.println(each);
      }

      System.out.println("================================");

      Developer dev1 = new Developer();
      dev1.setInfo("Baha","Dev",150000,76598);
      Developer dev2 = new Developer();
      dev2.setInfo("Muhtar","Dev",143526,8746590);

      scrum1.hireADeveloper(dev1);
      scrum1.hireADeveloper(dev2);

      scrum1.fireADeveloper(76598);

      System.out.println(scrum1.developers.size());

      for (Developer each : scrum1.developers){
        System.out.println(each);
      }

      System.out.println("================================");

      System.out.println("In my scrum team, We have " + scrum1.testers.size()+ " testers" + " and have " + scrum1.developers.size() + " developers");
    }
}

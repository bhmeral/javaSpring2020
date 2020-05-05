package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        TestersForCompany tester1 = new TestersForCompany();
        tester1.setTesterInfo("Muhtar",123,"Manual Tester",70000);

        ScrumTeam scrum = new ScrumTeam();

                scrum.hireTester(tester1);
        System.out.println(scrum.testers.size());

                scrum.fireTester(123);
        System.out.println(scrum.testers.size());
    }
}

package day34_CustomClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class TestersForCompanyObjects {
    public static void main(String[] args) {
        TestersForCompany tester1 = new TestersForCompany();
        tester1.setTesterInfo("Madina",183297740,"QA",200000);

        TestersForCompany tester2 = new TestersForCompany();
        tester2.setTesterInfo("Venara",18739237,"Senior SDET",179000);

        TestersForCompany tester3 = new TestersForCompany();
        tester3.setTesterInfo("Sha Rejepov",784784,"SDET",12000);

        TestersForCompany tester4 = new TestersForCompany();
        tester4.setTesterInfo("Muhtar",11434,"Manual Tester",120000);

        TestersForCompany tester5 = new TestersForCompany();
        tester5.setTesterInfo("John",231234,"PR",160000);

        ArrayList<TestersForCompany> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        testers.removeIf(p->!(p.JobTitle.contains("SDET")));

        double totalBudget = 0;
        for (TestersForCompany each : testers){
            System.out.println(each);
            totalBudget += each.Salary;
        }

        System.out.println(totalBudget+"$");
    }

}

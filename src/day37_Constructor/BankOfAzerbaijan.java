package day37_Constructor;

import java.util.ArrayList;

public class BankOfAzerbaijan {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResource.employee3);
        list.add(HumanResource.employee5);

      //  System.out.println(list.get(0));

        for ( Employee each : list){
            System.out.println(each);
        }
    }
}

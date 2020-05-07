package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DeveloperObject {
    public static void main(String[] args) {

         Developer developer1 = new Developer();
         developer1.setInfo("Baha","Dev",140000,6658397);
         System.out.println(developer1);

        System.out.println("==========================");

         Developer developer2 = new Developer();
         developer2.setInfo("Muhtar","Dev",130000,6548237);
        System.out.println(developer2);

        System.out.println("==========================");

        developer1.coding();
        developer2.coding();

        System.out.println("==========================");

        developer1.fixingBug();
        developer2.fixingBug();

        System.out.println("==========================");


        Developer [] array ={developer1,developer2};

        for ( Developer each : array){
            System.out.println(each.name);
        }

        System.out.println("==========================");

        for (int i=0; i<array.length; i++){
            System.out.println(array[i].Salary);
        }

        System.out.println("==========================");
        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(array));

        for (int i=0; i< developers.size(); i++){
            System.out.println(developers.get(i).name);
        }
        for (Developer each : developers){
            System.out.println(each.name + each.Salary);
        }

        System.out.println("==========================");

    }
}

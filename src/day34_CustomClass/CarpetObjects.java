package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;


public class CarpetObjects {
    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customOrder(1.80,3.4,17,true);
        carpets[1].customOrder(10,15,40,false);
        carpets[2].customOrder(19,40, 50,true);
        carpets[3].customOrder(2,4,5,false);


        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        for (Carpet eachCarpet : carpets){
            if (eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }
        }
        System.out.println(persianCarpets.size());



        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpets);

        System.out.println(regularCarpets.size());




    }




}

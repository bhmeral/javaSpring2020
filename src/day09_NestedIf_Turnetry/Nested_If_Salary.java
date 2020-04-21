package day09_NestedIf_Turnetry;

import java.sql.SQLOutput;

public class Nested_If_Salary {
    public static void main(String[] args) {

        double salary = 1000;
        byte workHistory = 4;
        String str = " ";
        if (salary>=30000){

            if (workHistory>=2){
                str = "You are qualified to get loan";

            }else{
                str = "You must have been on job at least 2 years";
            }

        }else{
            str = "You must earn at least 30000.";
        }
        {

        }

        System.out.println(str);




    }
}

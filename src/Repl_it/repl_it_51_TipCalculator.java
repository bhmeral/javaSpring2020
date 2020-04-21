package Repl_it;

import java.util.Scanner;

public class repl_it_51_TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tippercent = 0;

        System.out.println("Check amount:");
        int  chechamount = input.nextInt();

        System.out.println("Number of people entered");
        int nop = input.nextInt();

        System.out.println("Split or No Split");
        String sonp = input.next();
        if (sonp.equalsIgnoreCase("yes")){
          int split =  chechamount/nop;
        }else{
            int nosplit = chechamount;
        }

        System.out.println("Service quality");
        String servicequality = input.next();




        if (servicequality.equalsIgnoreCase("poor")){
            tippercent = 0.05;
            System.out.println("Number of people entered:" + nop);
            System.out.println("Total to pay: " + (chechamount+chechamount*0.05));
            System.out.println("Total tip: " + (chechamount*0.05));
            System.out.println("Total per person: " + (chechamount+chechamount*0.05)/nop);
            System.out.println("Total tip per person: " + (chechamount*0.05)/nop);
        }else if (servicequality.equalsIgnoreCase("fair")){
            tippercent = 0.10;
            System.out.println("Number of people entered:" + nop);
            System.out.println("Total to pay: " + (chechamount+chechamount*0.1));
            System.out.println("Total tip: "+ (chechamount*10));
            System.out.println("Total per person: " + (chechamount+chechamount*0.1)/nop);
            System.out.println("Total tip per person: " + (chechamount*0.1)/nop);
        }else if (servicequality.equalsIgnoreCase("good")){
            tippercent = 0.15;
            System.out.println("Number of people entered:" + nop);
            System.out.println("Total to pay: " + (chechamount+chechamount*0.15));
            System.out.println("Total tip: "+ (chechamount*0.15));
            System.out.println("Total per person: " + (chechamount+chechamount*0.15)/nop);
            System.out.println("Total tip per person: " + (chechamount*0.15)/nop);
        }else if (servicequality.equalsIgnoreCase("great")){
            tippercent = 0.20;
            System.out.println("Number of people entered:" + nop);
            System.out.println("Total to pay: " + (chechamount+(chechamount*0.2)));
            System.out.println("Total tip: "+ (chechamount*0.2));
            System.out.println("Total per person: " + (chechamount+chechamount*0.2)/nop);
            System.out.println("Total tip per person: " + (chechamount*0.2)/nop);
        }else{
            tippercent = 0.25;
            System.out.println("Number of people entered:" + nop);
            System.out.println("Total to pay: " + (chechamount+chechamount*0.25));
            System.out.println("Total tip: "+ (chechamount*0.25));
            System.out.println("Total per person: " + (chechamount+chechamount*0.25)/nop);
            System.out.println("Total tip per person: " + (chechamount*0.25)/nop);
        }








    }
}

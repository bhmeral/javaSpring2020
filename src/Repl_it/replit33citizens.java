package Repl_it;

import java.util.Scanner;

public class replit33citizens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = input.nextInt();
        int nonSeniorCitizens = input.nextInt();

        System.out.println("What is new citizen's age?");
        int citizensage = input.nextInt();

        if(citizensage>=65){
            System.out.println("Senior Citizen"); seniorCitizens+=1;
        }
        if(citizensage<65){
            System.out.println("Non Senior Citizen"); nonSeniorCitizens+=1;
        }

        String finalsc = "New seniorCitizens count " +seniorCitizens;
        String finalnsc = "New nonSeniorCitizens count " +nonSeniorCitizens;

        System.out.println(finalsc);
        System.out.println(finalnsc);
    }
}

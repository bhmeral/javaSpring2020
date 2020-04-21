package Repl_it;

import java.util.Scanner;

public class AssessmentTest_CaloriCalculator {
    public static void main(String[] args) {

        /*
        Running 6 mph = 10 MET
        Basketball = 8 MET
        Sleeping = 1 MET
         */
        Scanner input = new Scanner(System.in);
        int MET_run = 10;
        int MET_b_play = 8;
        int MET_sleep = 1;
        double weight = 0;
        double cal = 0;

        
        System.out.println("Enter weight in pounds");
        double person_weight = input.nextDouble();
        weight += person_weight;
        System.out.println("Enter the amount of time you ran in minutes");
        int running_time = input.nextInt();
        cal += 0.0175 *running_time*MET_run*weight/2.2;
        System.out.println("Enter the amount of time you played basketball in minutes");
        int play_time = input.nextInt();
        cal += 0.0175 *play_time*MET_b_play*weight/2.2;
        System.out.println("Enter the amount of time you slept in minutes");
        int sleep_time = input.nextInt();
        cal += 0.0175 *sleep_time*MET_sleep*weight/2.2;

        System.out.println("Calories Burned: " + (int)cal );







    }
}

package Repl_it;

import java.util.Scanner;

public class repl_it_25_SchoolGrader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter the subject name number 1 and score for this subject");
        String subject = input.next();
        double grade = input.nextDouble();
        System.out.println("Please enter the subject name number 2 and score for this subject");
        String subject2 = input.next();
        double grade2 = input.nextDouble();
        System.out.println("Please enter the subject name number 3 and score for this subject");
        String subject3 = input.next();
        double grade3 = input.nextDouble();
        System.out.println("Please enter the subject name number 4 and score for this subject");
        String subject4 = input.next();
        double grade4 = input.nextDouble();
        System.out.println("Please enter the subject name 5 and score for this subject");
        String subject5 = input.next();
        double grade5 = input.nextDouble();



        double gradetotal = grade + grade2 + grade3 + grade4 + grade5;
        double average = gradetotal/5;



        System.out.println("Summary:" + subject + " - " + grade + ", " + subject2 + " - " + grade2 + ", " + subject3 + " - " + grade3 + ", " + subject4 + " - " + grade4 + ", " + subject5 + " - " + grade5 + ".");
        System.out.println("Your average score is: ");
        System.out.println("Thank you for using Grader");
        System.out.println("Goodbye!");


       
    }
}

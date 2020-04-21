package day10_Switch_Scanner;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_rate_calculator {
    public static void main(String[] args) {

        Scanner result = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = result.nextInt();
        System.out.println("How many hours do you work per week");
        byte weeklyhours = result.nextByte();
        System.out.println("How many weeks do you work in year");
        byte yearlywork = result.nextByte();

        int hourlyrate = (salary/yearlywork) / weeklyhours;


        System.out.println("Your hourly rate is: " + hourlyrate);




    }
}

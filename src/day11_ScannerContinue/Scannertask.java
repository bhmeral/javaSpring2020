package day11_ScannerContinue;

import java.util.Scanner;

public class Scannertask {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstname = input.next();
        System.out.println(firstname);

        System.out.println("Enter your last name");
        String lastname = input.next();
        System.out.println(lastname);

        String fullName = firstname + lastname;


        System.out.println("Are you employeed?");
        boolean employeementStatus = input.nextBoolean();

        double salary = 0;
        if(employeementStatus==true){
            System.out.println("Enter your salary");
            salary = input.nextDouble();
        }



        System.out.println("Full name is: " + fullName);
        System.out.println("Employeed: " + employeementStatus);
        System.out.println("Salary: $" + salary);









    }
}

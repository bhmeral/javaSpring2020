package day11_ScannerContinue;

import java.util.Scanner;

public class warmupTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scan.nextDouble();
        System.out.println("Enter Federal tax rate:");
        double fedTax = scan.nextDouble();
        System.out.println("Enter State tax rate:");
        double stateTax = scan.nextDouble();


        double salaryaftertax = salary * (1-(fedTax + stateTax));


        System.out.println("Your salary is after tax is: $" + salaryaftertax );






    }
}

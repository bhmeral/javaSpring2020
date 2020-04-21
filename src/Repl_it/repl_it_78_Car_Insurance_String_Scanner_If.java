package Repl_it;

import day24_Methods.String_Reverse;

import java.util.Scanner;

public class repl_it_78_Car_Insurance_String_Scanner_If {
    public static void main(String[] args) {
        double premium = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        if (zipcode == 20910 || zipcode == 20740){
            premium += 60;
        }else if (zipcode == 22102 || zipcode == 22103){
            premium += 30;
        }else{
            premium += 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        String vehicleOwnership = scan.next();
        if (vehicleOwnership.equalsIgnoreCase("Owned")){
            premium += 10;
        }else{
            premium += 20;
        }
        System.out.println("How is this vehicle primarily used?");
        String vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("business")){
            premium += 50;
        }else if (vehicleUsage.equalsIgnoreCase("pleasure")){
            premium += 10;
        }else{
            premium += 20;
        }
        System.out.println("Days Driven To Work And/Or School");
            int daysDrivenToWorkOrSchool = scan.nextInt();
            premium += daysDrivenToWorkOrSchool*5;

        System.out.println("Miles Driven To Work And/Or School");
            int milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool*1;

        System.out.println("How old are you?");
             int age = scan.nextInt();
        if (age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if (age>16 && age<18){
            premium += premium*20;
        }else if (age>=18 && age<=21){
            premium += premium*6;
        }else{
            premium += premium*2;
        }

        System.out.println("How many years have you been driving");
        int drivingExperience = scan.nextInt();
        if (drivingExperience<0 &&  age-drivingExperience<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            premium += drivingExperience*5;
        }

        System.out.println("Have you had anc accidents in the last 5 years");
        String car_accident = scan.next();
        if (car_accident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int accidentsAmount = scan.nextInt();
            premium += (premium/5)*accidentsAmount;
        }

        System.out.println("Have you had continuous insurance for the past 12 months");
        String continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")){
            premium += premium*2;
        }

        System.out.println("What is the highest level of education you have completed?");
        String education = scan.next();
        if (education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Masters")||education.equalsIgnoreCase("Bachelors")){
            premium -= premium/20;
        }else if(education.equalsIgnoreCase("Doctors")){
            premium -= premium/10;
        }else{
            premium += premium/20;
        }

        String referenceNumber = name.substring(0,2) + age + name.substring(name.length()-2,name.length()-1);
        referenceNumber = referenceNumber.toUpperCase();


        System.out.println(name + " here is your quote!");
        System.out.println("Start Your Policy Today For: " + premium);
        System.out.println("Reference number: " + referenceNumber);


    }
}

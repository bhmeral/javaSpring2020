package OfficeHours.Practice_04_22_2020_Method;

import java.util.Scanner;

public class void_Method {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a US citizen");;
        String citizen = scan.next();
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        eligibilityToVote(age,citizen);
    }

    public static void print(){
        System.out.println("Hello World");
    }


    public static void eligibilityToVote (int age,String citizenship){
        if (citizenship.equalsIgnoreCase("Yes")){

            if (age>=18){
                System.out.println("You are eligible to vote");
            }else{
                int waityear=18-age;
                System.out.println("You need to wait " + waityear +  " years to vote");
            }

        }else{
            System.out.println("You can not vote");
        }


    }

}

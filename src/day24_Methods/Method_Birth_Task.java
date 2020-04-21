package day24_Methods;


import java.util.Scanner;

public class Method_Birth_Task {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birth_year =  scan.nextInt();
        age(birth_year);
    }

    public static void age(int birth_year) {
        int current_year = 2020;
        int age = current_year - birth_year;
        if (birth_year> current_year) {
            System.out.println("Dude are coming from future");

            if (age > 40) {
                System.out.println("Boomer");

            }

        }
        System.out.println("Your Birth year is: " + age);

        System.out.println("Task Ended =========================== Task Ended");
    }




    public  static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }

    public  static void printHelloCybertek(){
        printHello(); // Hello
        printCybertek(); // Cybertek
    }







}

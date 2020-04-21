package day12_JavaRecap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scannet_NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fullAdress = " ";


        System.out.println("Building Number: ");
        int bnumber = input.nextInt();
        fullAdress += bnumber+" ";

        input.nextLine();

        System.out.println("Street: ");
        String street = input.nextLine();
        fullAdress += street+" ";

        System.out.println("City: ");
        String city = input.next();
        fullAdress += city+" ";

        input.nextLine();

        System.out.println("State: ");
        String state = input.nextLine();
        fullAdress += state+" ";

        System.out.println("Zip Code: ");
        int zipcode = input.nextInt();
        fullAdress += zipcode+" ";

        System.out.println(fullAdress);

        input.close();
    }
}

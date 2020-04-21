package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // String str = input.next();
      //  System.out.println(str);
            String fullAdress = " ";

        System.out.println("Enter the number of the building:");
        short Bnumber = input.nextShort();
        fullAdress += Bnumber+ " ";

        System.out.println("Enter the Street Name: ");
        String streetname = input.next();
        fullAdress += streetname+" ";

        System.out.println("Enter the type of the road: ");
        String roadtype = input.next();
        fullAdress += roadtype+", ";

        System.out.println("Enter the city:");
        String city = input.nextLine();
        fullAdress += city+" ";

        input.nextLine();

        System.out.println("Enter the state");
        String state = input.next();
        fullAdress += state+ ", " ;

        System.out.println("Enter the zip code");
        int zipcode = input.nextInt();
        fullAdress += zipcode+" ";

        System.out.println(fullAdress);
    }
}

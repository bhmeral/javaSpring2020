package Repl_it;

import java.util.Scanner;

public class repl_it_56_LaptopConfigurator {
    public static void main(String[] args) {

        double price = 0;


        Scanner scan = new Scanner(System.in);


        System.out.println("Select screen size:");
        double screen_size = scan.nextDouble();

        if (screen_size==13.3){
            price += 200;
        }else if (screen_size==15.0){
            price += 300;
        }else{
            price += 400;
        }

        System.out.println("Select CPU type:");
        String cpuType = scan.next();

        if (cpuType.equalsIgnoreCase("i3")){
            price += 150;
        }else if (cpuType.equalsIgnoreCase("i5")){
            price += 250;
        }else{
            price += 350;
        }

        System.out.println("Select RAM size:");
        int ram_size = scan.nextInt();
         price += 50*(ram_size/4);



        System.out.println("Select storage type:");
        String storage_type = scan.next();

        if (storage_type.equals("HDD")){
            System.out.println("Memory size:");
            int memory_size = scan.nextInt();
            price += 50*(memory_size/500);
        }else{
            System.out.println("Enter Memory size:");
            int memory_size = scan.nextInt();
            price += 100*(memory_size/500);
        }




        System.out.println("Enter screen resolution:");
        String screenType = scan.next();

        if (screenType.equalsIgnoreCase("FULLHD")){
            price += 100;
        }else{
            price += 200;
        }


        System.out.println("Laptop price is: " + price);

    }
}

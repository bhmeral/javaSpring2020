package Repl_it;

import java.util.Scanner;

public class repl_it_47_RealEstate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int propertyPrice = 0;




        System.out.println("Enter your property type");
        String houseType = scan.nextLine();
        if (houseType.equalsIgnoreCase("Condo")){
            propertyPrice += 50000;
        }else if (houseType.equalsIgnoreCase("Townhouse")){
            propertyPrice += 75000;
        }else{
            propertyPrice += 95000;
        }

        System.out.println("How many bedrooms do you have?");
        int numberOfBedrooms = scan.nextInt();
        propertyPrice += numberOfBedrooms * 30000;

        System.out.println("Do you have a backyard?");
        boolean backyard = scan.nextBoolean();

        if (backyard==true && houseType.equalsIgnoreCase("Condo")){
            System.out.println("Backyard is not available for condo!");
        }else{
            propertyPrice += 5000;
        }

        System.out.println("Do you have a garage?");
        boolean garage = scan.nextBoolean();

        if (garage==true){
            System.out.println("How many spots?");
            int garageSpots = scan.nextInt();
            if (garageSpots>10){
                System.out.println("Pardon, it's not a public parking");

            }else{
                propertyPrice += garageSpots * 20000;
            }
        }

        System.out.println("How close is metro station?");
        float metroAccessibility = scan.nextFloat();

        if(metroAccessibility<=1 ){
            propertyPrice += 10000;
        }else if (metroAccessibility<3 && metroAccessibility>1){
            propertyPrice += 5000;
        }else{
            propertyPrice += 0;
        }

        System.out.println("How close is highway");
        float highwayAccessibility = scan.nextFloat();

        if (highwayAccessibility<=1){
            propertyPrice += 15000;
        }else if (highwayAccessibility>1 && highwayAccessibility<5){
            propertyPrice += 8000;
        }else{
            propertyPrice += 4000;
        }

        System.out.println("What's the rating of nearest school");
        float schoolScore = scan.nextFloat();

        if (schoolScore<=10 && schoolScore>8){
            propertyPrice += 45000;
        }else if(schoolScore<8 && schoolScore>=4){
            propertyPrice += 20000;
        }else{
            propertyPrice += 5000;
        }

        System.out.println("Does any of your family members smoking");
        boolean smoking = scan.nextBoolean();

        if (smoking==true){
            propertyPrice -= 5000;
        }

        System.out.println("Market report has been generated");
        System.out.println("Your estimate market price is: "+propertyPrice+ "$");



    }
}

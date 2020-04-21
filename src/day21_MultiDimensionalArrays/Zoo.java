package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String [] wildAnimals = {"Tiger","Lion","Monkey","Turtle","Alligator"};
        String [] birds = {"Eagle","Ducks","Peacock","Chicken"};

        String [][] zoo = {wildAnimals,birds};
                //              0        1

        String kfc =  zoo[1][3]; // Chicken
        System.out.println(kfc);

        System.out.println("=========================================================");

        for ( String eachbird : zoo[1]){
            if (eachbird.equals("Chicken")){
                continue;
            }
            System.out.println(eachbird);
        }

        System.out.println("================================================================");


        for (String eachwildanimals : zoo[0]){
            System.out.println(eachwildanimals);
        }



    }
}

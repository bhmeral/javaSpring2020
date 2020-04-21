package day21_MultiDimensionalArrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {
        String names [] = {"Reem","Omer","Muhtar","Emrah","Mohammed","Ana"};


        int maxLengthString = names[0].length();
        String longest_word = "";
        String shortest_word = "";

        for (int i=1; i<names.length; i++){
            if (names[i].length() > maxLengthString){
                maxLengthString = names[i].length();
                longest_word = names[i];
            }

            if (names[i].length() < maxLengthString){
                maxLengthString = names[i].length();
               shortest_word = names[i];
            }
        }



        System.out.println(longest_word);
        System.out.println(shortest_word);


    }
}

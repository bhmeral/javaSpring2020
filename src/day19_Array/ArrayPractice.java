package day19_Array;

public class ArrayPractice {
    public static void main(String[] args) {
        String[] name = {"nameA","nameB","nameC","nameD"};
        String result = "";

        for (int i=0; i<=3; i++){
         result =  name[i];
            System.out.println(result);
        }

        System.out.println("=======================================================================");

        String[] emails = {"cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"} ;

         // print out all users who registered with their gm_ail
         // max: 4

        for (int i=0; i<=3; i++){

             String email = emails[i];
             if (email.endsWith("gmail.com")) {
                 System.out.println(email);

             }
        }




    }

}

package day14_StringContinue;

public class webadress {
    public static void main(String[] args) {
        /*
        write a program that validate if a web adress is valid
         */

        String webadress = "www.bahameral.edu";
                webadress = webadress.toLowerCase();

         boolean validending = webadress.endsWith(".com") ||webadress.endsWith(".gov")
         || webadress.endsWith(".edu");

        if(webadress.startsWith("www.") && validending){
            System.out.println("Valid Address");
        }else{
            System.out.println("Invalid Address");
        }







    }
}

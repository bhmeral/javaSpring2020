package day14_StringContinue;

public class pracitce {
    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";
        String userinputgmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputgmail);

        if(result){
            System.out.println("Logged In");
        }

        System.out.println("=================================================================");
        /*
        valid password MUST contain a special character such as (!,_,
        valid password should not contain spaces
         */

        String password = "mmasd 1235";

        if(password.contains(" ")){
            System.out.println("Password cannot have space");
        }else{
            System.out.println("Valid Password");
        }
        System.out.println("=================================================================");
        /*
            every website has "http" at the beginning of the web address
        */

        String webAdress = "WwW.AmAzOn.CoM";
                webAdress = webAdress.toLowerCase();
        if(webAdress.startsWith("www.")){  // true
         System.out.println("valid");
          }else{
            System.out.println("unvalid");
        }

        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l"));
        System.out.println(s4.endsWith("School"));

        System.out.println(s4.endsWith("Cybertek"));
        System.out.println("=================================================================");


        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid Gmail");
        }

        /*
        write a program that validate if a web adress is valid
         */







    }
}

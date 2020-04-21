package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
                 //  0123455678
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);

        String fullname = "Kuzzat Altay";
        String firstName = fullname.substring(0,6);
        String lastname = fullname.substring(7,12);

        System.out.println(firstName);
        System.out.println(lastname);

        // full name = firstName + lastname
        // gmail : lastname_firstname@gmail.com

        String baha = "Baha Meral";
       //              0123456789
        String firstname = baha.substring(0,4);
        String lastName = baha.substring(5,10);
        System.out.println(firstname);
        System.out.println(lastName);

       // String gmail = lastName.concat("_").concat(firstname).concat("@gmail.com");

        String gmail = lastName + "_" + firstname + "@gmail.com";
        System.out.println(gmail);

        // substring(beginning index)
        String s1 = "I love Java Programming Language";
        String className = s1.substring(7);
        System.out.println(className);




        String s2 = "I like C Programming";
            s2 = s2.replace("C", "Java");
        System.out.println(s2);

        String name = "COVID 18";
                name = name.replace("18","19");
        System.out.println(name);

        String r1 = "I like cat, cat is fun, cat is cool";
                r1 = r1.replaceFirst("cat","dog");
        System.out.println(r1);

        String r2 = "tomorrow is Monday, tomorrow is Tuesday";
                r2 = r2.replaceFirst("tomorrow","today");
        System.out.println(r2);

        String fName = "Baha Meral";
        String fiName = fName.substring(0, fName.indexOf(" "));
        String lName = fName.substring(fName.indexOf(" ") + 1);
        System.out.println(fiName);
        System.out.println(lName);


    }


}

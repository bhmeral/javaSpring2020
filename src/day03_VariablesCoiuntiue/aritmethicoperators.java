package day03_VariablesCoiuntiue;

public class aritmethicoperators {
    public static void main(String[] args) {

        System.out.println( 5 + 3 ); //8
        System.out.println(  10 -2); //8
        System.out.println( 10*3); //30
        System.out.println(10/2); // 5

    // System.out.prinln(30/0); // number cannot be divider to 0




        int result1 = 10 % 3;

        System.out.print(result1);




        double d2 = 10/4;
        System.out.println(d2);


        int a=10 /3;
        System.out.println(a);


        System.out.println(10/4.0);


        double d = 10/4;
        System.out.println(d);



        boolean evennumber = 25%2 ==0;
                        // 1 === 0 ==> false
        // if 25/2 has a reminder of zero, then it's even number
        System.out.println(evennumber);


        boolean oddNumber = 22%2 !=0; // odd num
                // 0 != 0 ===> false
        System.out.println( 10 % 2 == 0);
        System.out.println( 11%11 == 0);


        System.out.println( "10 is even number:" + (10%2==0));
        System.out.println( "11 is even number: "+ (11%2==0));

        System.out.println("25 is odd number:" + (25%2!=0));

        System.out.println(" 25 is even number:" +(25% 2 ==0));
        System.out.println(" 25 is even number:" +!(25% 2 !=0));
//

    }
}

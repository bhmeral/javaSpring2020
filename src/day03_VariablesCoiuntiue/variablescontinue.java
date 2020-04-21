package day03_VariablesCoiuntiue;

public class variablescontinue {
    public static void main(String[] args) {

    boolean result1 =  true;
    boolean result2 = false;
  /*
     >  : greater
     >= : greater than or equal
     <  : less
     <= : less than or equal
     == : equal
     != : not equal
  */

    boolean result3 =  10>9; // true
        System.out.println(result1);

        System.out.println( true==false);

        System.out.println( "Muhtar" == "Good Guy");
        //         Bad Guy == Good Guy==> false
        System.out.println("Muhtar" != "Good Guy");
        //         Bad Guy != Good Guy ==> true

        boolean r1 = true != true; // false
        System.out.println(r1);    // false

        boolean r2 = "Batch 17" == "Batch 18";
        System.out.println(r2);


        System.out.println("=================================================");



        char ch1 = 'A';
        System.out.println(ch1); // A

        char ch2 = 4500;
        System.out.println(ch2);

        int num1 = 'D';
        System.out.println(num1);


        char a1 = 'z';
       // byte b1 = a1 // char is larger than byte

        // short s1=a1; // char is larger than short

        int b1 = a1; // int is larger than char







    }
}

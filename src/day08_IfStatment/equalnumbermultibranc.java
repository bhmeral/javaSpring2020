package day08_IfStatment;

public class equalnumbermultibranc {
    public static void main(String[] args) {

        double n1 = 100;
        double n2 = 100;
        double n3 = 200;

            String result = " ";

        if(n1==n2 && n1!=n3){
            // System.out.println( " n1 is equal to n2");
            result = " n1 is equal to n2";


        } else if( n1==n3 && n1!=n2){
            // System.out.println(" n1 is equal to n3");
            result = " n1 is equal to n3";

        }
          else if ( n2==n3 && n1!=n2){
          //  System.out.println(" n2 is equal to n3");
            result = " n2 is equal to n3";

        }
          else if ( n1==n2 && n2==n3){
            //  System.out.println("all number are equal");
            result = " All of them are equal";

        }

          else{
            // System.out.println("none of the number are equal");
        }   result = " None of them are equal";

        System.out.println(result);










    }
}

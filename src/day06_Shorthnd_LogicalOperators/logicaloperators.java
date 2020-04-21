package day06_Shorthnd_LogicalOperators;

public class logicaloperators {
    public static void main(String[] args) {
        boolean result1 = true;
        System.out.println(!result1); // false

        boolean result2 = !(10 + 15 > 15); // false
        System.out.println(result2);


        boolean result3 = !true == !false;
                        // false == true ==> false
        System.out.println(result3);



        boolean result4 =  10==12 && 15==15;
        System.out.println(result4);

        boolean Result1 = 'a' == 'b' -1 && 'b'+1 == 'c' ;
        System.out.println(Result1);

        boolean result5 = 10==11 || 13==15;
        System.out.println(result5);

        boolean R6 = !!!!false;
                /*
                 !!!true
                 !!false
                 !true
                 false
                */
        System.out.println(R6);

    }
}

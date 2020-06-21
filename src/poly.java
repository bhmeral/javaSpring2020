public class poly {
    public static void main(String[] args) {
//        for (char ch = '\u0041'; ch <= '\u005A' ; ch++){
//            if (ch > '\u0041'){
//                System.out.print(',');
//            }
//            System.out.print(ch);

//            double d = 10;
//            System.out.println(d);
//
//            int a = (int)10d;
//            System.out.println(a);

//        long a = 1000000000000000L;
//        char ch = '\141';
//        System.out.println(ch);
//        String d1 = "\141";
//        System.out.println(d1);


        int a = 0;
        int b = 1;
        int c;

//        for (int i = 0 ; i < 30 ; i++){
//            c = a + b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//
//        }

         

          int number = 5432;
        for (int i = 0; i < 4 ; i++) {
            int digit = number % 10;
            String reversedNumber = "";
            reversedNumber += digit;
            number /=  10;
            System.out.print(reversedNumber);
        }


//         for (int i = 0; i < 6; i++){
//             int number = 51651;
//             int digit = number % 10;
//                number / 10;
//             String reversedNumber = "";
//             reversedNumber += "" + digit;
//             System.out.print(reversedNumber);
//
//         }



    }
}

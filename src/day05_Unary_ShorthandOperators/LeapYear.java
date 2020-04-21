package day05_Unary_ShorthandOperators;

public class LeapYear {
    public static void main(String[] args) {

        short year=2001;
        // leapYear: year % 4 ==0; ===> if it true leap year if it false not a leap year
        boolean LeapYear= year % 4 ==0;
         // System.out.println( year+ " is leap year: " + LeapYear);

        String result = year + " is leap year: " + LeapYear;
        System.out.println(result);











    }
}

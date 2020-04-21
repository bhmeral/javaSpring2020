package day08_IfStatment;

public class numberofdaysinamonth {
    public static void main(String[] args) {
        /*
        28 days :2
        30 days : 4,6,9,11
              */











        int month = 100;

        if ( month == 2){
            System.out.println("Month has 28 days.");
        }

        if ( month ==3 || month==6  || month==9 || month==11) {
            System.out.println("Month has 30 days.");
        }

        if (!(month == 2 ||month ==3 || month==6  || month==9 || month==11)){
            System.out.println("Month has 31 days.");
        }






















    }



}

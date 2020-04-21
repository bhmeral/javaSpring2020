package day10_Switch_Scanner.day10_warmuptask;

public class WarmUpTask {
    public static void main(String[] args) {

        int day = 2;
        String output = " ";

        if (day >= 1 && 7 >= day) {
            if (day == 1) {
                output = "Monday";
            } else if (day == 2) {
                output = "Tuesday";
            } else if (day == 3) {
                output = "Wednesday";
            } else if (day == 4) {
                output = "Thursday";
            } else if (day == 5) {
                output = "Friday";
            } else if (day == 6) {
                output = "Saturday";
            } else {
                output = "Sunday";
            }

        } else {
            output = "Invalid Entry";
        }

        System.out.println(output);


        System.out.println("=================================================");

        int num2 = 1;
        String result = "";

        if (day >= 1 && 7 >= day) {

            result = (num2 == 1) ? "Monday" : (num2 == 2) ? "Tuesday" : (num2 == 3) ? "Wednesday" :
                    (num2 == 4) ? "Thursday" : (num2 == 5) ? "Friday" : (num2 == 6) ? "Sturday" :
                            (num2 == 7) ? "Sunday" : "Invalid Entry";

            System.out.println(result);


        } else {

        }

        System.out.println("===================================");
        int num3 = 100;
        String result2 = "";


        if (day > 0 && 8> day){

            result2 = (num3 == 1) ? "Monday" : (num3 == 2) ? "Tuesday" : (num3 == 3)? "Wednesday" :
                    (num3 == 4) ? "Thursday" : (num3 == 5) ? "Friday" : (num3 == 6)? "Saturday" :
                             "Sunday" ;


        }else{
            result2 = "Invalid Entry";
        }
        System.out.println(result2);



    }



}
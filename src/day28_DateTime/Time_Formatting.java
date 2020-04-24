package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time = LocalTime.of(16,30);
        System.out.println(time.format(dtf));

        LocalTime time2 = LocalTime.of(10,0);

        System.out.println(time2.format(dtf));

        System.out.println(  time.isAfter(time2) );
    }
}

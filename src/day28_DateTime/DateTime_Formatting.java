package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2015,12,25,12,30,45);
        System.out.println(dateTime);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy EEEE hh:mm:ss a");

        System.out.println(dateTime.format(dtf));

    }
}

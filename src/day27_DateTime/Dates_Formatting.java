package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        // days_month_year


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy EEEE");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDate date2 = LocalDate.of(1999,10,24);
        String str1 = date2.format(dtf2);
        System.out.println(str1);

        LocalDate date3 = LocalDate.now();

        System.out.println(date3.format(dtf));
    }
}

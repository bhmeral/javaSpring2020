package day27_DateTime;

import java.time.LocalDate;
import java.util.Locale;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020,10,20);
        LocalDate birth_day = LocalDate.of(2000,02,29);


        System.out.println(date1);
        System.out.println(birth_day);

        // isAfter(date2)

        System.out.println( date1.isAfter(birth_day));

        // isBefore(date2)

        System.out.println(date1.isBefore((birth_day)));

        // isEqual(date2)

        System.out.println(date1.isEqual(birth_day));

        // isLeapYear();

        System.out.println(date1.isLeapYear());

        System.out.println("=======================================================");

        LocalDate now1 = LocalDate.now();
        System.out.println(now1);

        System.out.println("=======================================================");

        LocalDate birthday = LocalDate.of(1990,04,25);
        int month = birthday.getDayOfMonth();
        System.out.println(month);


        LocalDate now = LocalDate.now();
        String str = now.toString();
        System.out.println(str.replaceAll("-", "/"));
    }

}

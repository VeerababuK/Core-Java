package chapter1.quesstions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateOne {
    public static void main(String[] args) {
        String date = LocalDate
                .parse("2014-05-04")
                //.format(DateTimeFormatter.ISO_DATE_TIME); // Throws Exception
                //.format(DateTimeFormatter.ISO_LOCAL_TIME); // Throws Exception
                //.format(DateTimeFormatter.ISO_LOCAL_DATE); // Work Good
        System.out.println(date);
        System.out.println(new Date());
    }
}

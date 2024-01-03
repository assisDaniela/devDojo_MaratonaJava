package classesutilitarias;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date = LocalDate.parse("2024-01-02");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(date);
        System.out.println(time);
        LocalDateTime dateTime1 = date.atTime(time);
        LocalDateTime dateTime2 = time.atDate(date);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}

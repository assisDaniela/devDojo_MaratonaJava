package classesutilitarias;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(date); // formato geralmente usado em bancos de dados

        System.out.println("Imutável");
        System.out.println(now.plusDays(7));
        System.out.println(now);
    }
}

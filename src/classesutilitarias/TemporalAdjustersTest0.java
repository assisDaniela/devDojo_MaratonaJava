package classesutilitarias;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TemporalAdjustersTest0 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2024, 3, 22);
        System.out.println(now);
        System.out.println(now.plusDays(20));
        System.out.println(now.withDayOfMonth(20));
        System.out.println(now.withMonth(1));
        System.out.println(now.with(ChronoField.DAY_OF_MONTH, 20));
    }
}

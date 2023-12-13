package classesutilitarias;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println();
        Date date = c.getTime();
        System.out.println(date);

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(c.getTime());
        c.add(Calendar.HOUR, 24);
        System.out.println(c.getTime());
        c = Calendar.getInstance();
        c.roll(Calendar.HOUR, 24);
        System.out.println(c.getTime());
    }
}

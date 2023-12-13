package classesutilitarias;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        // Países suportados
        String[] isoCountries = Locale.getISOCountries();
        // Línguas suportadas
        String[] isoLanguages = Locale.getISOLanguages();

        System.out.println("\n--------------------------------------\n");

        Locale localeBrasil = new Locale("pt", "BR");
        Locale localePortugal = new Locale("pt", "PT");

        Calendar calendar = Calendar.getInstance();
        DateFormat dfBrasil = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat dfPortugal = DateFormat.getDateInstance(DateFormat.FULL, localePortugal);

        System.out.printf("Data Brasil:   %s\n", dfBrasil.format(calendar.getTime()));
        System.out.printf("Data Portugal: %s\n", dfPortugal.format(calendar.getTime()));

        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.printf("%s: %s\n", localeIndia.getDisplayCountry(), df1.format(calendar.getTime()));
        System.out.printf("%s: %s\n", localeJapao.getDisplayCountry(), df2.format(calendar.getTime()));
        System.out.printf("%s: %s\n", localeHolanda.getDisplayCountry(), df3.format(calendar.getTime()));
        System.out.println("--------------------------------------");
        System.out.printf("%s: %s\n", localeIndia.getDisplayCountry(localeIndia), df1.format(calendar.getTime()));
        System.out.printf("%s: %s\n", localeJapao.getDisplayCountry(localeJapao), df2.format(calendar.getTime()));
        System.out.printf("%s: %s\n", localeHolanda.getDisplayCountry(localeHolanda), df3.format(calendar.getTime()));
    }
}

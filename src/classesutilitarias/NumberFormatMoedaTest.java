package classesutilitarias;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatMoedaTest {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000.2130;

        for(NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}

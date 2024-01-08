package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {

    public static void printMatcher(String regex, String texto) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "; ");
        }

        System.out.println();
    }

    public static void findHexadecimalCode(String texto) {
        String regex = "0[xX]([a-fA-F0-9])+(\\s|$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()) {
            String hexCode = matcher.group();
//            int hex = Integer.parseInt(hexCode);
            System.out.println(hexCode);
        }
    }

    public static void main(String[] args) {
        printMatcher("ab", "abaaba");
        // Neste caso, a regex "aba" começando no index 2 não é considerada
        // porque a busca de um novo match é feito a partir do index 3
        printMatcher("aba", "abababa");
        printMatcher("abc", "cafeBABE");
        // Trabalhando com range
        printMatcher("[abc]", "cafeBABE");
        printMatcher("[abcABC]", "cafeBABE");
        printMatcher("[a-zA-C]", "cafeBABE");

        // Identificando código hexadecimal em texto
        findHexadecimalCode("12 0x 0X 0xFFABC 0x10G 0x1");
    }
}

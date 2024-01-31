import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> list;
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(4);
        array.add(7);
        array.add(1);
        array.add(8);
        array.add(4);

        list = array;
        Collections.sort(list);
        for(int n : list) {
            System.out.println(n);
        }
    }
}
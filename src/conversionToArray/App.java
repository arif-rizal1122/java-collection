package conversionToArray;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = List.of("a", "b", "c");
        Object[] objects = names.toArray();                // konversi ke objects array
        String[] strings = names.toArray(new String[]{});  // konversi ke strings array

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));

    }
}

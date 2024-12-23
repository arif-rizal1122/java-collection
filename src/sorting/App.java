package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("a", "b", "c"));

        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

    }
}

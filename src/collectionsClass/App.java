package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("a", "b", "c", "d"));

        System.out.println(names);
        System.out.println("================ ");
        Collections.reverse(names);
        System.out.println(names);
        System.out.println("================ ");
        Collections.shuffle(names);
        System.out.println(names);


    }
}

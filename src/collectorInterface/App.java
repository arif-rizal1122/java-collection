package collectorInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();
        names.add("arif");
        names.add("rizal");
        names.add("aja");
        names.addAll(Arrays.asList("apa", "aja", "boleh", "??"));
        names.remove("apa");
        names.removeAll(List.of("aja", "aja"));
        for (var name : names){
            System.out.print(name + ", ");
        }

        System.out.println("======================");
        System.out.println(names.contains("arif"));                               // true
        System.out.println(names.containsAll(Arrays.asList("aja", "aja")));       // false
    }
}

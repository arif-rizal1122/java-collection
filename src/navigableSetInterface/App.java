package navigableSetInterface;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("arif", "rizal", "aza"));

        NavigableSet<String> namesDesc = names.descendingSet();
        NavigableSet<String> arif = names.headSet("arif", true);
        NavigableSet<String> arifin = names.tailSet("arif", true);
        for (var name : names){
            System.out.println(name + ". ");
        }
        System.out.println(namesDesc); // [rizal, aza, arif]
        System.out.println(arif);      // [arif]
        System.out.println(arifin);    // [arif, aza, rizal]

        System.out.println("=================== ");
        // NavigableSet<String> immutable = Collections.unmodifiableSet(names);


    }
}

package itarableDanIterator;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("=================== ITERABLE");
        Iterable<String> names = List.of("arif", "rizal", "aja");
        for (var name : names){
            System.out.println(name);
        }
        System.out.println("=================== ITERATOR");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}

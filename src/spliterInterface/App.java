package spliterInterface;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {

        List<String> names = List.of("a", "b", "c", "d", "e"); // hasilnya 5 sebelum di split
        Spliterator<String> spliterator1 = names.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        System.out.println("split1 : " + spliterator1.estimateSize()); //  3
        System.out.println("split2 : " +spliterator2.estimateSize());  //  2
        System.out.println("\n====================");
        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print("[ "+ s + ", " + " ]");
            }
        });

    }
}

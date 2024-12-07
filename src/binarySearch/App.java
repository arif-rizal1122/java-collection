package binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 70; i++) {
            numbers.add(i);
        }
        int index = Collections.binarySearch(numbers, 20);
        System.out.println(index);



    }
}

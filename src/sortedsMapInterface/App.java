package sortedsMapInterface;

import imutableList.data.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("A", "a");
        sortedMap.put("B", "b");
        sortedMap.put("C", "c");

        for (var key : sortedMap.keySet()){
            System.out.println(key);
        }
        System.out.println("================================== ");

        SortedMap<Person, String> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        map.put(new Person("D"), "d");
        map.put(new Person("E"), "e");
        map.put(new Person("V"), "v");
        for (var keys : map.entrySet()){
            System.out.println(keys.getValue());
        }
        System.out.println("=========================== ");
        SortedMap<String, String> map1 = Collections.emptySortedMap();
        SortedMap<String, String> map2 = Collections.emptySortedMap();
        // map2.put("error"); // error




    }
}

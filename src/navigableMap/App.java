package navigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();
        map.put("EKO", "EKO");
        map.put("Budi", "Budi");
        map.put("Cecep", "Cecep");

        System.out.println(map.lowerKey("EKO"));
        System.out.println(map.higherKey("Eko"));
        System.out.println(map.floorKey("Cecep"));
        System.out.println(map.ceilingKey("Budi"));

    }
}

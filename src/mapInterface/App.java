package mapInterface;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("firstname", "arif");
        map.put("middlename", "aza");
        map.put("lastname", "rizal");

        for (var m : map.values()){
            System.out.println(m);
        }
        System.out.println("=====================  ");

        Map<Integer, Integer> map1 = new WeakHashMap<>();
        for (int i = 0; i < 10000000; i++){
            map1.put(i, i);
        }
        System.gc();
        System.out.println(map1.size());
        System.out.println("===================== ");

        String key = "name.first";
        String name = "name";
        String first = "first";

        String key1 = name + ". " + first;
        Map<String, String> map2 = new IdentityHashMap<>(); // dia tidak berurutan datanya
        map2.put(key, "arif");
        map2.put(key1, "rizal");
        for (var m2 : map2.values()){
            System.out.println(m2);
        }
        System.out.println(map2.size());
        System.out.println();
        System.out.println("======================== ");

        Map<String, String> map3 = new LinkedHashMap<>();
        map3.put("budi", "bude");
        map3.put("adil", "adel");
        map3.put("evi", "eva");
        for (var m3 : map3.keySet()){
            System.out.println(m3);
        }
        System.out.println("========================  ");
        EnumMap<Level, String> map4 = new EnumMap<>(Level.class);
        map4.put(Level.FREE, "gratis");
        map4.put(Level.STANDARD, "standard");
        map4.put(Level.PREMIUM, "premium");

        System.out.println(map4.get(Level.PREMIUM));
        System.out.println(map4.get(Level.STANDARD));
        System.out.println(map4.get(Level.FREE));
        System.out.println("=================== ");
        System.out.println(map4.get(Level.VIP));


    }
}

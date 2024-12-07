package entryMapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var entry : entries){
            System.out.println("================ ");
            System.out.println("Key " + entry.getKey());
            System.out.println("value " + entry.getValue());
        }

    }
}

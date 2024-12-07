package imutableMap;

import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String, String> name = Map.of(
                "first", "arif",
                "middle", "aza",
                "last", "rizal"
        );
        // name.put("middle", "ups"); // error
        for (var sm : name.values()){
            System.out.println(sm);
        }

    }
}

package listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("=============== LIST");
        List<String> names = new ArrayList<>(); // ini bisa di set berapa yg ingin dimasukan
        names.add("arif");
        names.add("rizal");
        names.add("aza");
        names.set(2, "set aza");
        System.out.println(names.get(2));
        System.out.println(names.get(1));
        System.out.println("================ LINKEDlIST");

        LinkedList<String> things = new LinkedList<>(); // ini bisa di set berapa yg ingin dimasukan
        things.add("apa");
        things.add("aja");
        things.add("boleh");
        things.set(0, "what");
        for (var thing : things){
            System.out.print(thing + ". ");
        }

    }
}

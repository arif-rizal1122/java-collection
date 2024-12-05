package dequeInterface;

import java.util.Deque;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("arif");
        stack.offerFirst("aza");
        stack.offerLast("rizal");
        for (var item = stack.pollLast(); item != null; item = stack.pollLast()){
            System.out.println(item);
        }

    }
}

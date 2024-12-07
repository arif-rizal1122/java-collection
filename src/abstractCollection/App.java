package abstractCollection;

import java.util.Queue;

public class App {
    public static void main(String[] args) {

        Queue<String> queue = new Singleque<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());

    }
}

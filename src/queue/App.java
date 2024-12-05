package queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        System.out.println("============== ArrayDeque ");
        Queue<String> queue = new ArrayDeque<>(10);
        queue.offer("ake");
        queue.offer("eki");
        queue.offer("aku");
        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }
        System.out.println(queue.size());

        System.out.println("============== PriorityQueue");
        Queue<String> queue1 = new PriorityQueue<>(10);
        queue1.offer("ake");
        queue1.offer("eki");
        queue1.offer("aku");
        for (String next = queue1.poll(); next != null; next = queue1.poll()){
            System.out.println(next);
        }
        System.out.println(queue1.size());
    }
}

package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.offerLast("Edho");
        stack.offerLast("Dwi");
        stack.offerLast("Tirwanda");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
//        for (var value : deque) {
//            System.out.println(value);
//        }

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Edho");
        queue.offerLast("Dwi");
        queue.offerLast("Tirwanda");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}

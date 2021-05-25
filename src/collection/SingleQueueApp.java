package collection;

import collection.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> singleQueue = new SingleQueue<>();

        singleQueue.offer("Edho");
        singleQueue.offer("Dwi"); // Reject
        singleQueue.offer("Tirwanda"); // Reject

        System.out.println(singleQueue.size());
    }
}

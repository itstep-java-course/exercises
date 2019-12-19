package com.itstep.collections.queue.dequeue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.add("1");
        queue.add("1");

        queue.offer("1");

        queue.add("1");

    }
}

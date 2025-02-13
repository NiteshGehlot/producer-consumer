package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    private final Queue<String> queue = new LinkedList<>();

    public synchronized void addMessage(String message) {
        queue.offer(message);
        notify();  // Notify consumers
    }

    public synchronized String getMessage() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}


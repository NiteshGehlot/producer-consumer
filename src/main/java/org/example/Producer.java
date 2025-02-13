package org.example;

public class Producer {
    private final MessageQueue queue;

    public Producer(MessageQueue queue) {
        this.queue = queue;           // constructor injection
    }

    public void produce(String message) {
        System.out.println("Producing: " + message);
        queue.addMessage(message);   // add message to the queue
    }
}


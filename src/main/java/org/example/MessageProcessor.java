package org.example;

public class MessageProcessor {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        for (int i = 1; i <= 10; i++) {
            producer.produce("Message " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total Messages Processed: " + consumer.getSuccessCount());
        System.out.println("Total Errors: " + consumer.getErrorCount());
    }
}


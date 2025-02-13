package org.example;

import java.util.Random;

public class Consumer implements Runnable {
    private final MessageQueue queue;
    private int successCount = 0;
    private int errorCount = 0;

    public Consumer(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = queue.getMessage();
                processMessage(message);
                successCount++;
            } catch (Exception e) {
                errorCount++;
                System.err.println("Error processing message: " + e.getMessage());
            }
        }
    }

    private void processMessage(String message) throws Exception {
        System.out.println("Consuming: " + message);
        if (new Random().nextInt(10) < 2) { // Simulating a failure 20% of the time
            throw new Exception("Simulated processing failure");
        }
    }

    public int getSuccessCount() {
        return successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }
}


package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProducerConsumerTest {
    @Test
    void testProducerConsumer() throws InterruptedException {
        MessageQueue queue = new MessageQueue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        producer.produce("Test Message 1");
        producer.produce("Test Message 2");

        Thread.sleep(2000);

        assertTrue(consumer.getSuccessCount() > 0);
    }
}


package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MessageQueueTest {
    @Test
    void testMessageQueue() throws InterruptedException {
        MessageQueue queue = new MessageQueue();
        queue.addMessage("Test Message");

        String message = queue.getMessage();
        assertEquals("Test Message", message);
    }
}


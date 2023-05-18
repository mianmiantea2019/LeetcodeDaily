package Queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-18
 * @LastEditors: mianmiantea2019
 * @Description:
 */
//FIFO
public class _232ImplementQueueusingStacksTest {
    @Test
    void testQueueOperations() {
        _232ImplementQueueusingStacks myQueue = new _232ImplementQueueusingStacks();

        assertTrue(myQueue.empty());

        myQueue.push(1);
        assertFalse(myQueue.empty());
        assertEquals(1, myQueue.peek());

        myQueue.push(2);
        assertEquals(1, myQueue.peek());
        assertEquals(1, myQueue.pop());
        assertEquals(2, myQueue.peek());
        assertFalse(myQueue.empty());

        assertEquals(2, myQueue.pop());
        assertTrue(myQueue.empty());
    }
}

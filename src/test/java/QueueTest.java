import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void queueTest1() {
        Queue<Integer> queue = new Queue<>();

        assertNull(queue.peekFirst());
        assertNull(queue.peekLast());
        assertNull(queue.removeAndGetValue());
    }

    @Test
    void queueTest2() {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);


        assertEquals(1, queue.peekFirst());
        assertEquals(4, queue.peekLast());
    }

    @Test
    void queueTest3() {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.remove();

        assertEquals(2, queue.peekFirst());
        assertEquals(4, queue.peekLast());
    }

    @Test
    void queueTest4() {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        assertEquals(1, queue.removeAndGetValue());
        assertEquals(2, queue.peekFirst());
        assertEquals(4, queue.peekLast());
    }

    @Test
    void queueTest5() {
        Queue<Integer> queue = new Queue<>();

        assertTrue(queue.isEmpty());
    }

    @Test
    void queueTest6() {
        Queue<Integer> queue = new Queue<>();
        queue.add(2);

        assertFalse(queue.isEmpty());
    }
}
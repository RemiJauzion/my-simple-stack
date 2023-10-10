package butrjau;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class DefaultStackTest {

    @Test
    void isEmpty() {
        DefaultStack stack = new DefaultStack();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    void getSize() {
        DefaultStack stack = new DefaultStack();
        DefaultItem item = new DefaultItem();
        stack.push(item);
    }

    @Test
    void push() {
    }

    @Test
    void peek() {
    }

    @Test
    void pop() {
    }
}
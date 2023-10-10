package butrjau;

import java.util.EmptyStackException;

/**
 * DefaultStack
 */
public class DefaultStack implements SimpleStack {

    /**
     * Tests if this stack is empty.
     *
     * @return if is empty
     */
    @Override
    public boolean isEmpty() {
        return true;
    }

    /**
     * @return the number of items in this stack.
     */
    @Override
    public int getSize() {
        return 0;
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item item
     */
    @Override
    public void push(Item item) {

    }

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     *
     * @return exception
     * @throws EmptyStackException exception
     */
    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @return exception
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}

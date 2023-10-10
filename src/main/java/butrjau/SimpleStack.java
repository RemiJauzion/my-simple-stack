/**
 *
 */
package butrjau;

import java.util.EmptyStackException;

/**
 *
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return if is empty
     */
    boolean isEmpty();
    /**
     * @return the number of items in this stack.
     */
    int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item item
     */
    void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing it from the
     stack.
     @return exception
     @throws EmptyStackException exception
     */

    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     * @return exception
     */
    Item pop() throws EmptyStackException;
}


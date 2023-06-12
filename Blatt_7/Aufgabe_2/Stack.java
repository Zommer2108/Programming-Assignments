package Aufgabe_2;

/**
 * Interface for a stack.
 * @param <E> the type of the elements in the stack
 */
public interface Stack {
    /**
     * Pushes an element onto the stack.
     * @param element the element to be pushed
     */
    void push(E element);

    /**
     * Removes the top element from the stack.
     * @return the removed element
     */
    E pop();

    /**
     * Returns the top element of the stack.
     * @return the top element
     */
    E top();

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     * @return the number of elements
     */
    int size();
}


/*
 * Introducing Classes: A Stack Class
 *
 * A Stack Class:
 * - A stack is a data structure following Last-In-First-Out (LIFO).
 * - Common operations: push (add item), pop (remove item), peek (view top item).
 * - This class uses an array to store elements and demonstrates class design.
 *
 * This program implements a Stack class with:
 * - Fields: Array for storage, index for top of stack.
 * - Constructor: Initializes stack with a given size.
 * - Methods: push, pop, peek, and isEmpty.
 * - Uses concepts like encapsulation (private fields), methods, and constructors.
 *
 * Why It Matters:
 * - Shows how to create a reusable class for a real-world data structure.
 * - Combines multiple class concepts (fields, methods, constructors).
 *
 * Exercise:
 * 1. Add a method `isFull()` to check if the stack is full.
 * 2. Modify the Stack to throw an exception if push is called on a full stack or pop on an empty stack.
 * 3. Test the Stack with different data types (e.g., use generics: Stack<T>).
 */
public class StackDemo {
    // Stack class definition
    static class Stack {
        private int[] items; // Encapsulation: private array to store elements
        private int top; // Index of top element
        private int capacity; // Maximum size of stack

        // Constructor: Initialize stack with given size
        Stack(int size) {
            this.capacity = size;
            this.items = new int[size];
            this.top = -1; // Empty stack
        }

        // Method: Push an item onto the stack
        void push(int item) {
            if (top < capacity - 1) { // Check for stack overflow
                items[++top] = item;
            } else {
                System.out.println("Stack is full!");
            }
        }

        // Method: Pop an item from the stack
        int pop() {
            if (top >= 0) { // Check for empty stack
                return items[top--];
            } else {
                System.out.println("Stack is empty!");
                return -1; // Error value
            }
        }

        // Method: Peek at the top item
        int peek() {
            if (top >= 0) {
                return items[top];
            } else {
                System.out.println("Stack is empty!");
                return -1; // Error value
            }
        }

        // Method: Check if stack is empty
        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        // Create a Stack object
        Stack stack = new Stack(5);

        // Test stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top item: " + stack.peek()); // Should print 30
        System.out.println("Popped: " + stack.pop()); // Should print 30
        System.out.println("Popped: " + stack.pop()); // Should print 20
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false
        System.out.println("Popped: " + stack.pop()); // Should print 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print true
        stack.pop(); // Should print "Stack is empty!"
    }
}
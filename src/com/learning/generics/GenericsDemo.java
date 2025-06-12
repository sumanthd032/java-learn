package com.learning.generics;

/*
 * Generics: Type Wrappers, Autoboxing, A Simple Generic Example
 *
 * 1. Type Wrappers:
 * - Java provides wrapper classes (e.g., Integer, Double) for primitive types (int, double).
 * - Allows primitives to be used as objects, especially in generics (which don’t support primitives).
 * - Example: Integer wraps int, Double wraps double.
 *
 * 2. Autoboxing:
 * - Automatic conversion between primitives and their wrapper classes.
 * - Boxing: Primitive to wrapper (e.g., int to Integer).
 * - Unboxing: Wrapper to primitive (e.g., Integer to int).
 *
 * 3. A Simple Generic Example:
 * - Generics allow classes, interfaces, and methods to operate on parameterized types.
 * - Syntax: class ClassName<T> { ... }
 * - Provides type safety at compile time, eliminating casts.
 *
 * This program demonstrates type wrappers, autoboxing, and a simple generic class Box.
 *
 * Package:
 * - In `com.learning.generics` to demonstrate package organization.
 *
 * Why It Matters:
 * - Type wrappers enable primitives in object-oriented contexts.
 * - Autoboxing simplifies code by handling conversions automatically.
 * - Generics ensure type safety and reusability.
 *
 * Exercise:
 * 1. Modify Box to include a method that compares two Box objects of the same type (if T implements Comparable).
 * 2. Demonstrate autoboxing with a Double wrapper.
 * 3. Create a generic method that prints the contents of any Box<T>.
 */

// Simple generic class with one type parameter
class Box<T> {
    private T content;

    // Constructor
    public Box(T content) {
        this.content = content;
    }

    // Getter
    public T getContent() {
        return content;
    }

    // Setter
    public void setContent(T content) {
        this.content = content;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Type Wrappers
        Integer intWrapper = new Integer(42); // Manual wrapping (deprecated constructor)
        Double doubleWrapper = Double.valueOf(3.14); // Preferred way
        System.out.println("Integer wrapper: " + intWrapper);
        System.out.println("Double wrapper: " + doubleWrapper);

        // Autoboxing
        Integer autoBoxed = 100; // Autoboxing: int to Integer
        int unboxed = autoBoxed; // Unboxing: Integer to int
        System.out.println("Autoboxed Integer: " + autoBoxed);
        System.out.println("Unboxed int: " + unboxed);

        // Simple Generic Example
        Box<Integer> intBox = new Box<>(10); // Type-safe, no casting needed
        Box<String> stringBox = new Box<>("Hello, Generics!");

        System.out.println("Integer Box content: " + intBox.getContent());
        System.out.println("String Box content: " + stringBox.getContent());

        // Demonstrate type safety
        intBox.setContent(20); // Works
        // intBox.setContent("Invalid"); // Compilation error: type mismatch
    }
}
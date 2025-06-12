package com.learning.generics;

/*
 * Generics: Generic Class with Two Type Parameters, The General Form of a Generic Class
 *
 * 1. Generic Class with Two Type Parameters:
 * - A generic class can use multiple type parameters, e.g., class Pair<K, V>.
 * - Each parameter can be used independently within the class.
 *
 * 2. The General Form of a Generic Class:
 * - Syntax: class ClassName<T1, T2, ..., Tn> { ... }
 * - T1, T2, etc., are type parameters, replaced with concrete types when instantiated.
 * - Can include fields, methods, and constructors using the type parameters.
 *
 * This program demonstrates a Pair class with two type parameters (K, V) to store key-value pairs.
 *
 * Package:
 * - In `com.learning.generics` to demonstrate package organization.
 *
 * Why It Matters:
 * - Multiple type parameters enable flexible, reusable classes (e.g., Map<K, V>).
 * - The general form allows defining custom generic structures.
 *
 * Exercise:
 * 1. Add a method to Pair to swap the key and value, returning a new Pair<V, K>.
 * 2. Create a generic class with three type parameters (e.g., a Triplet).
 * 3. Use Pair to store a String key and a Double value.
 */

// Generic class with two type parameters
class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getters
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // Setters
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair[key=" + key + ", value=" + value + "]";
    }
}

public class TwoTypeGenericsDemo {
    public static void main(String[] args) {
        // Create Pair with different type combinations
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        Pair<Integer, String> pair2 = new Pair<>(1, "First");

        // Access and display pairs
        System.out.println("Pair1: " + pair1);
        System.out.println("Pair2: " + pair2);

        // Modify pair
        pair1.setValue(26);
        System.out.println("Modified Pair1: " + pair1);

        // Demonstrate type safety
        // pair1.setKey(123); // Compilation error: type mismatch

        // Use with different types
        Pair<String, Double> pair3 = new Pair<>("Price", 99.99);
        System.out.println("Pair3: " + pair3);
    }
}
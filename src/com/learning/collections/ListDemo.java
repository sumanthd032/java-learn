package com.learning.collections;

/*
 * Collections Framework: Overview, ArrayList Class, LinkedList Class
 *
 * 1. Overview:
 * - The Java Collections Framework provides a set of interfaces and classes for storing and manipulating groups of objects.
 * - Key interfaces: Collection, List, Set, Queue, Map.
 * - Found in java.util package, designed for flexibility, performance, and type safety (via generics).
 * - Common operations: add, remove, iterate, search.
 *
 * 2. ArrayList Class:
 * - Implements List interface, backed by a dynamic array.
 * - Fast random access (O(1)), but slower for insertions/deletions in the middle (O(n)).
 * - Allows duplicates and maintains insertion order.
 * - Common methods: add(), get(), remove(), size().
 *
 * 3. LinkedList Class:
 * - Implements List and Deque interfaces, backed by a doubly-linked list.
 * - Fast for insertions/deletions (O(1)), but slower for random access (O(n)).
 * - Allows duplicates and maintains insertion order.
 * - Also supports queue operations (e.g., offer(), poll()).
 *
 * This program demonstrates ArrayList and LinkedList with basic operations.
 *
 * Package:
 * - In `com.learning.collections` to demonstrate package organization.
 *
 * Why It Matters:
 * - Collections simplify data management in Java programs.
 * - ArrayList is ideal for frequent access; LinkedList is better for frequent modifications.
 *
 * Exercise:
 * 1. Add a method to reverse an ArrayList using Collections.reverse().
 * 2. Use LinkedList as a queue with offer() and poll().
 * 3. Compare the time taken to add 10,000 elements to the start of ArrayList vs. LinkedList.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // ArrayList Example
        List<String> arrayList = new ArrayList<>();
        // Add elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Banana"); // Duplicates allowed
        System.out.println("ArrayList: " + arrayList);

        // Access and modify
        System.out.println("Element at index 1: " + arrayList.get(1)); // Banana
        arrayList.set(1, "Mango");
        System.out.println("After set: " + arrayList);

        // Remove
        arrayList.remove("Orange");
        System.out.println("After remove: " + arrayList);
        System.out.println("Size: " + arrayList.size());

        // LinkedList Example
        List<String> linkedList = new LinkedList<>();
        // Add elements
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Mouse");
        linkedList.add("Cat"); // Duplicates allowed
        System.out.println("\nLinkedList: " + linkedList);

        // Access and modify
        System.out.println("Element at index 1: " + linkedList.get(1)); // Cat
        linkedList.set(1, "Rabbit");
        System.out.println("After set: " + linkedList);

        // Remove
        linkedList.remove("Mouse");
        System.out.println("After remove: " + linkedList);
        System.out.println("Size: " + linkedList.size());

        // Demonstrate LinkedList-specific operation
        LinkedList<String> ll = (LinkedList<String>) linkedList;
        ll.addFirst("Horse");
        System.out.println("After addFirst: " + ll);
    }
}
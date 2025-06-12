package com.learning.collections;

/*
 * Collections Framework: HashSet Class, TreeSet Class, ArrayDeque Class
 *
 * 1. HashSet Class:
 * - Implements Set interface, backed by a hash table.
 * - Does not allow duplicates, does not maintain insertion order.
 * - Fast for add, remove, and contains operations (average O(1)).
 * - Common methods: add(), remove(), contains(), size().
 *
 * 2. TreeSet Class:
 * - Implements NavigableSet interface, backed by a red-black tree.
 * - Does not allow duplicates, maintains sorted order (natural or custom).
 * - Slower than HashSet (O(log n) for operations), but provides sorted iteration.
 * - Common methods: add(), remove(), first(), last().
 *
 * 3. ArrayDeque Class:
 * - Implements Deque interface, backed by a resizable array.
 * - Supports double-ended queue operations (add/remove from both ends).
 * - Fast for add and remove operations (O(1) amortized).
 * - Can be used as a stack (push/pop) or queue (offer/poll).
 *
 * This program demonstrates HashSet, TreeSet, and ArrayDeque with basic operations.
 *
 * Package:
 * - In `com.learning.collections` to demonstrate package organization.
 *
 * Why It Matters:
 * - HashSet is ideal for fast, unordered unique elements.
 * - TreeSet is useful for sorted unique elements.
 * - ArrayDeque is versatile for stack/queue operations.
 *
 * Exercise:
 * 1. Use HashSet to remove duplicates from an ArrayList.
 * 2. Implement a TreeSet with a custom comparator for reverse order.
 * 3. Use ArrayDeque as a stack to reverse a string.
 */

import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.Deque;

public class SetAndDequeDemo {
    public static void main(String[] args) {
        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        // Add elements
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Green");
        hashSet.add("Blue"); // Duplicate ignored
        System.out.println("HashSet: " + hashSet); // Order not guaranteed

        // Check contains and remove
        System.out.println("Contains Blue? " + hashSet.contains("Blue"));
        hashSet.remove("Red");
        System.out.println("After remove: " + hashSet);
        System.out.println("Size: " + hashSet.size());

        // TreeSet Example
        Set<String> treeSet = new TreeSet<>();
        // Add elements
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Blue"); // Duplicate ignored
        System.out.println("\nTreeSet: " + treeSet); // Sorted order

        // Access first and last
        TreeSet<String> ts = (TreeSet<String>) treeSet;
        System.out.println("First: " + ts.first());
        System.out.println("Last: " + ts.last());

        // ArrayDeque Example
        Deque<String> arrayDeque = new ArrayDeque<>();
        // Add elements (queue operations)
        arrayDeque.offer("Apple");
        arrayDeque.offer("Banana");
        arrayDeque.offer("Orange");
        System.out.println("\nArrayDeque (queue): " + arrayDeque);

        // Add to front and back
        arrayDeque.offerFirst("Mango");
        arrayDeque.offerLast("Grape");
        System.out.println("After offerFirst/Last: " + arrayDeque);

        // Remove from front and back
        System.out.println("Poll first: " + arrayDeque.pollFirst());
        System.out.println("Poll last: " + arrayDeque.pollLast());
        System.out.println("After polls: " + arrayDeque);

        // Use as stack
        arrayDeque.push("Kiwi");
        System.out.println("After push: " + arrayDeque);
        System.out.println("Pop: " + arrayDeque.pop());
        System.out.println("After pop: " + arrayDeque);
    }
}
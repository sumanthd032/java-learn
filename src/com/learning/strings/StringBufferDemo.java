package com.learning.strings;

/*
 * String Handling: StringBuffer
 *
 * StringBuffer:
 * - A mutable sequence of characters, unlike String which is immutable.
 * - Thread-safe (synchronized methods), suitable for multithreaded environments.
 * - Common methods: append(), insert(), delete(), reverse(), setCharAt().
 * - Use when frequent string modifications are needed to avoid creating multiple String objects.
 *
 * This program demonstrates StringBuffer operations for building and modifying strings.
 *
 * Package:
 * - In `com.learning.strings` to demonstrate package organization.
 *
 * Why It Matters:
 * - StringBuffer improves performance for string manipulations in multithreaded programs.
 *
 * Exercise:
 * 1. Create a method that uses StringBuffer to build a comma-separated list from an array.
 * 2. Modify the program to reverse only part of the StringBuffer.
 * 3. Compare performance of String concatenation vs. StringBuffer for 1000 appends.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        // Create StringBuffer
        StringBuffer sb = new StringBuffer("Java");

        // Append
        sb.append(" Programming");
        System.out.println("After append: " + sb); // Java Programming

        // Insert
        sb.insert(4, " is");
        System.out.println("After insert: " + sb); // Java is Programming

        // Delete
        sb.delete(4, 7); // Remove " is"
        System.out.println("After delete: " + sb); // Java Programming

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb); // gnimmargorP avaJ

        // SetCharAt
        sb.setCharAt(0, 'G');
        System.out.println("After setCharAt: " + sb); // GnimmargorP avaJ

        // Capacity and Length
        System.out.println("Length: " + sb.length()); // 16
        System.out.println("Capacity: " + sb.capacity()); // Initial capacity (16) + string length

        // Ensure capacity
        sb.ensureCapacity(50);
        System.out.println("New capacity: " + sb.capacity()); // At least 50
    }
}
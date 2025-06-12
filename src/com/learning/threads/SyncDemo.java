package com.learning.threads;

/*
 * Multithreaded Programming: Synchronization
 *
 * Synchronization:
 * - Ensures that only one thread accesses a shared resource at a time, preventing race conditions.
 * - Achieved using:
 *   - Synchronized methods: `synchronized returnType methodName() { body }`
 *   - Synchronized blocks: `synchronized (object) { code }`
 * - Monitors (locks) are used to control access to synchronized code.
 *
 * This program demonstrates synchronization with a shared Counter class accessed by multiple threads.
 * - Without synchronization, the counter’s value would be inconsistent due to concurrent modifications.
 * - With synchronization, updates are thread-safe.
 *
 * Package:
 * - In `com.learning.threads` to demonstrate package organization.
 *
 * Why It Matters:
 * - Synchronization is critical in multithreaded programs to ensure data integrity.
 *
 * Exercise:
 * 1. Remove the synchronized keyword and observe the inconsistent counter values.
 * 2. Use a synchronized block instead of a synchronized method in Counter.
 * 3. Create a new thread that decrements the counter and ensure synchronization.
 */

public class SyncDemo {
    // Shared resource
    static class Counter {
        private int count;

        // Synchronized method
        synchronized void increment(String threadName) {
            int temp = count;
            System.out.println(threadName + " reads count: " + temp);
            try {
                Thread.sleep(100); // Simulate work
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
            count = temp + 1;
            System.out.println(threadName + " sets count: " + count);
        }

        int getCount() {
            return count;
        }
    }

    // Thread subclass
    static class CounterThread extends Thread {
        private String name;
        private Counter counter;
        private int increments;

        CounterThread(String name, Counter counter, int increments) {
            this.name = name;
            this.counter = counter;
            this.increments = increments;
        }

        @Override
        public void run() {
            for (int i = 0; i < increments; i++) {
                counter.increment(name);
            }
        }
    }

    public static void main(String[] args) {
        // Create shared Counter
        Counter counter = new Counter();

        // Create multiple threads accessing the same Counter
        CounterThread thread1 = new CounterThread("Thread-1", counter, 5);
        CounterThread thread2 = new CounterThread("Thread-2", counter, 5);

        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final count: " + counter.getCount()); // Should be 10
    }
}
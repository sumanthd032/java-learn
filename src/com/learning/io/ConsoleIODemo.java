package com.learning.io;

/*
 * File I/O: Reading Console Input, Writing Console Output, PrintWriter Class
 *
 * 1. Reading Console Input:
 * - Use Scanner class (java.util.Scanner) to read input from System.in (standard input).
 * - Supports reading strings, numbers, and other data types.
 *
 * 2. Writing Console Output:
 * - Use System.out.println() or System.out.print() for basic console output.
 * - Provides simple text output to the console.
 *
 * 3. PrintWriter Class:
 * - PrintWriter (java.io.PrintWriter) is a flexible class for formatted output.
 * - Can write to console (via System.out) or files.
 * - Methods like print(), println(), and printf() support various data types.
 * - Automatically flushes output if autoFlush is enabled.
 *
 * This program demonstrates console input with Scanner and output with both System.out and PrintWriter.
 *
 * Package:
 * - In `com.learning.io` to demonstrate package organization.
 *
 * Why It Matters:
 * - Console I/O is essential for interactive programs.
 * - PrintWriter provides a robust way to format output.
 *
 * Exercise:
 * 1. Modify the program to read and parse a double from the console.
 * 2. Use PrintWriter’s printf() to format output with two decimal places.
 * 3. Handle invalid input (e.g., non-integer input) using exception handling.
 */
import java.util.Scanner;
import java.io.PrintWriter;

public class ConsoleIODemo {
    public static void main(String[] args) {
        // Reading Console Input with Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Writing Console Output with System.out
        System.out.println("System.out: Hello, " + name + "! You are " + age + " years old.");

        // Writing Console Output with PrintWriter
        PrintWriter consoleWriter = new PrintWriter(System.out, true); // autoFlush = true
        consoleWriter.println("PrintWriter: Hello, " + name + "! You are " + age + " years old.");

        // Clean up
        scanner.close();
        consoleWriter.close(); // Good practice, though not critical for System.out
    }
}
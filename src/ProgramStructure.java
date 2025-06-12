/*
 * Overview of Java: Structure of a Java Program
 *
 * Structure of a Java Program:
 * A Java program is organized into specific components that the JVM expects:
 * 1. Package Declaration: Groups related classes (optional, e.g., package com.example).
 * 2. Imports: Bring in external classes (e.g., java.util.Scanner).
 * 3. Class Declaration: Defines the program’s structure (must match file name for public classes).
 * 4. Main Method: Entry point with signature `public static void main(String[] args)`.
 * 5. Methods and Fields: Define behavior and data within the class.
 *
 * This program demonstrates:
 * - A package declaration (optional here).
 * - Import of java.util.Scanner for user input.
 * - A public class with a main method as the entry point.
 * - A simple method to process data, showing program flow.
 *
 * Why It Matters:
 * Understanding the structure ensures you write valid, executable Java programs.
 *
 * Exercise:
 * 1. Add a new method to this class that takes user input and returns a different greeting.
 * 2. Move this class into a package (e.g., com.learning.java) and update the file structure.
 */
import java.util.Scanner;

public class ProgramStructure {
    // Main method: Program entry point
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Call a method to process input
        String greeting = createGreeting(name);

        // Output result
        System.out.println(greeting);

        // Close scanner
        scanner.close();
    }

    // Method to create a greeting
    private static String createGreeting(String name) {
        return "Hello, " + name + "! Welcome to Java!";
    }
}
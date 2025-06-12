package com.learning.io;

/*
 * File I/O: File I/O Basics, Reading and Writing Files, Closing a File, PrintWriter Class
 *
 * 1. File I/O Basics:
 * - Java provides classes in java.io for file input/output operations.
 * - Common classes: FileReader, FileWriter, BufferedReader, BufferedWriter, PrintWriter.
 * - File operations may throw IOException, requiring exception handling.
 *
 * 2. Reading and Writing Files:
 * - Reading: Use BufferedReader to read text files line by line.
 * - Writing: Use PrintWriter or BufferedWriter to write text to files.
 * - Files are accessed via file paths (relative or absolute).
 *
 * 3. Closing a File:
 * - Files must be closed to release system resources using close().
 * - Use try-with-resources to automatically close files.
 *
 * 4. PrintWriter Class:
 * - Used here for writing formatted text to a file.
 * - Supports print(), println(), and printf() methods.
 *
 * This program writes data to a file using PrintWriter and reads it back using BufferedReader.
 *
 * Package:
 * - In `com.learning.io` to demonstrate package organization.
 *
 * Why It Matters:
 * - File I/O is critical for persistent data storage and retrieval.
 * - Proper file closing prevents resource leaks.
 *
 * Exercise:
 * 1. Modify the program to append to the file instead of overwriting it.
 * 2. Add error handling for FileNotFoundException separately.
 * 3. Write a method to read the file and count the number of lines.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {
        String fileName = "output.txt";

        // Writing to a File with PrintWriter
        try (PrintWriter writer = new PrintWriter(fileName)) {
            // Write data
            writer.println("Hello, Java File I/O!");
            writer.println("Line 2: This is a test.");
            writer.printf("Line 3: Number %d\n", 42);
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a File with BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading from " + fileName + ":");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
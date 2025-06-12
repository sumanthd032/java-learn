/*
 * Overview of Java: Data Types and Arrays
 *
 * Data Types:
 * Java has two categories of data types:
 * 1. Primitive Types (8 types, stored directly in memory):
 *    - byte (8-bit integer), short (16-bit), int (32-bit), long (64-bit)
 *    - float (32-bit float), double (64-bit float)
 *    - char (16-bit Unicode character), boolean (true/false)
 * 2. Reference Types: Objects (e.g., String, arrays, custom classes) stored as references to memory.
 *
 * Arrays:
 * - Arrays are fixed-size, ordered collections of elements of the same type.
 * - Syntax: `type[] arrayName = new type[size];` or `type[] arrayName = {value1, value2, ...};`
 * - Access elements with index (0-based): arrayName[index].
 * - Common operations: length (arrayName.length), looping, and element manipulation.
 *
 * This program demonstrates:
 * - Primitive types (int, double, char, boolean).
 * - Reference type (String).
 * - Single-dimensional and multi-dimensional arrays.
 *
 * Why It Matters:
 * Data types define how data is stored and manipulated, while arrays enable efficient storage of multiple values.
 *
 * Exercise:
 * 1. Create an array of doubles and compute its average.
 * 2. Add a method to print a 2D array in a matrix format.
 */
public class DataTypesAndArrays {
    public static void main(String[] args) {
        // Primitive data types
        int age = 25; // 32-bit integer
        double salary = 50000.75; // 64-bit floating-point
        char grade = 'A'; // 16-bit Unicode character
        boolean isEmployed = true; // true or false

        // Reference type
        String name = "Alice"; // String is a class, not a primitive

        // Single-dimensional array
        int[] numbers = {1, 2, 3, 4, 5}; // Array initialization
        int sum = 0;
        for (int num : numbers) { // Enhanced for loop to iterate array
            sum += num;
        }

        // Multi-dimensional array (2D)
        int[][] matrix = { {1, 2}, {3, 4}, {5, 6} }; // 3x2 matrix

        // Output results
        System.out.println("Primitive Types:");
        System.out.println("Age: " + age + ", Salary: " + salary + ", Grade: " + grade + ", Employed: " + isEmployed);
        System.out.println("Reference Type: Name = " + name);
        System.out.println("Array Sum: " + sum);
        System.out.println("Matrix[1][1]: " + matrix[1][1]); // Access element
    }
}
package com.learning.exceptions;

/*
 * Exception Handling: Fundamentals, Types, Uncaught Exceptions, Try and Catch Blocks,
 * Multiple Catch, Nested Try, throw, throws, finally
 *
 * 1. Fundamentals:
 * - Exceptions are events that disrupt normal program flow (e.g., division by zero, file not found).
 * - Java uses exceptions to handle errors gracefully, ensuring robust programs.
 *
 * 2. Types:
 * - Checked Exceptions: Must be declared or handled (e.g., IOException). Subclass of Exception (excluding RuntimeException).
 * - Unchecked Exceptions: Don’t need to be declared (e.g., NullPointerException). Subclass of RuntimeException.
 * - Errors: Serious issues (e.g., OutOfMemoryError), not typically caught.
 *
 * 3. Uncaught Exceptions:
 * - If an exception isn’t caught, it propagates up the call stack, terminating the program with a stack trace.
 *
 * 4. Try and Catch Blocks:
 * - `try { code } catch (ExceptionType e) { handle }`: Try block contains code that might throw an exception; catch handles it.
 *
 * 5. Multiple Catch:
 * - Multiple catch blocks handle different exception types for the same try block.
 * - Order matters: Specific exceptions before general (e.g., ArithmeticException before Exception).
 *
 * 6. Nested Try:
 * - Try blocks can be nested inside other try or catch blocks for fine-grained error handling.
 *
 * 7. throw:
 * - Used to explicitly throw an exception: `throw new ExceptionType("message");`.
 *
 * 8. throws:
 * - Declares that a method might throw checked exceptions: `returnType methodName() throws ExceptionType`.
 * - Caller must handle or declare the exception.
 *
 * 9. finally:
 * - `finally { code }` executes regardless of whether an exception is thrown or caught.
 * - Useful for cleanup (e.g., closing resources).
 *
 * This program demonstrates all these concepts with a division operation that handles various exceptions.
 *
 * Package:
 * - In `com.learning.exceptions` to demonstrate package organization.
 *
 * Exercise:
 * 1. Add a method that throws a checked exception (e.g., IOException) and handle it in main.
 * 2. Create a nested try block to handle a different exception (e.g., ArrayIndexOutOfBoundsException).
 * 3. Modify divide to use a finally block to print a completion message.
 */

public class ExceptionDemo {
    // Method that might throw exceptions
    public static double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed"); // throw
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        // Try and Catch, Multiple Catch
        try {
            int[] numbers = {1, 2};
            System.out.println("Accessing array element: " + numbers[0]); // Valid access
            System.out.println("Result: " + divide(10, 2)); // Valid division

            // Nested Try
            try {
                System.out.println("Accessing invalid array element: " + numbers[5]); // Throws ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Nested catch: " + e.getMessage());
            }

            System.out.println("Result: " + divide(10, 0)); // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            // Catch general exceptions (must be last)
            System.out.println("General exception caught: " + e.getMessage());
        } finally {
            // Finally block: Always executes
            System.out.println("Finally block executed.");
        }

        // Uncaught Exceptions: Will terminate program if not caught
        try {
            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught uncaught exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
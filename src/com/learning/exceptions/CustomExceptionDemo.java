package com.learning.exceptions;

/*
 * Exception Handling: Creating Own Exceptions
 *
 * Creating Own Exceptions:
 * - Custom exceptions are user-defined classes that extend Exception (checked) or RuntimeException (unchecked).
 * - Used to represent specific error conditions in your application.
 * - Typically include a constructor to set the error message.
 *
 * This program defines a custom InvalidRadiusException and uses it in a Circle class to validate radius.
 *
 * Package:
 * - In `com.learning.exceptions` to demonstrate package organization.
 *
 * Why It Matters:
 * - Custom exceptions make error handling more specific and meaningful.
 * - Improves code readability and maintainability.
 *
 * Exercise:
 * 1. Create another custom exception (e.g., NegativeDimensionException) for invalid dimensions.
 * 2. Modify Circle to throw NegativeDimensionException for negative radius.
 * 3. Use InvalidRadiusException in a method with multiple catch blocks.
 */

// Custom exception: Extends Exception for checked exception
class InvalidRadiusException extends Exception {
    public InvalidRadiusException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static class Circle {
        private double radius;

        // Constructor: Throws custom exception
        public Circle(double radius) throws InvalidRadiusException {
            if (radius <= 0) {
                throw new InvalidRadiusException("Radius must be positive: " + radius);
            }
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        // Try creating Circle objects
        try {
            Circle validCircle = new Circle(5.0);
            System.out.println("Valid Circle Area: " + validCircle.getArea());

            Circle invalidCircle = new Circle(-1.0); // Will throw InvalidRadiusException
        } catch (InvalidRadiusException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for cleanup.");
        }

        // Demonstrate custom exception in another context
        try {
            createCircleWithRadius(0); // Will throw InvalidRadiusException
        } catch (InvalidRadiusException e) {
            System.out.println("Caught in method call: " + e.getMessage());
        }
    }

    // Method that declares throws
    static Circle createCircleWithRadius(double radius) throws InvalidRadiusException {
        return new Circle(radius);
    }
}
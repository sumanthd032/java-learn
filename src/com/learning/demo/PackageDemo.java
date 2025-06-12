

/*
 * Packages and Interfaces: Packages, Importing Packages, Interfaces, Default Interface Methods
 *
 * Packages:
 * - Packages organize classes into namespaces to avoid naming conflicts and improve maintainability.
 * - Syntax: `package com.example;`
 * - This class is in `com.learning.demo`, separate from the `com.learning.shapes` package.
 *
 * Importing Packages:
 * - Use `import` to access classes from other packages.
 * - Example: `import com.learning.shapes.Circle;` or `import com.learning.shapes.*;`
 * - Without imports, fully qualified names (e.g., com.learning.shapes.Circle) are needed.
 *
 * Interfaces and Default Interface Methods:
 * - This class uses the Shape interface and Circle class to demonstrate interface implementation.
 * - Calls the default method getDescription() from Shape.
 *
 * This program creates a Circle object and demonstrates package usage, imports, and interface features.
 *
 * Why It Matters:
 * - Packages keep code organized, especially in large projects.
 * - Imports simplify code by avoiding fully qualified names.
 * - Interfaces and default methods enable flexible, reusable code.
 *
 * Exercise:
 * 1. Create a new class in com.learning.shapes (e.g., Square) that implements Shape.
 * 2. Import and use Square in this class.
 * 3. Try accessing a protected or default-access member of Circle from this package (should cause an error).
 */
package com.learning.demo;

import com.learning.shapes.Circle;
import com.learning.shapes.Shape;

public class PackageDemo {
    public static void main(String[] args) {
        // Create a Circle object (from com.learning.shapes package)
        Shape circle = new Circle(5.0); // Interface reference for polymorphism

        // Use interface methods
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Description: " + circle.getDescription()); // Default method

        // Access public Circle method
        Circle c = (Circle) circle; // Cast to access Circle-specific methods
        System.out.println("Circle Radius: " + c.getRadius());

        // Demonstrate access protection
        // System.out.println(c.radius); // Compilation error: radius is private
    }
}